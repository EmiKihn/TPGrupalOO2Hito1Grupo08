package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import datos.Cocinero;
import datos.PersonalFestival;
public class PersonalFestivalDao {
	
	private static Session session;
	private static Transaction tx;
	private static PersonalFestivalDao instancia = null; 

	public static PersonalFestivalDao getInstance() {
		if(instancia==null) {
			instancia= new PersonalFestivalDao();
		}
		return instancia;
	}
	
	protected void iniciaOperacion() throws HibernateException{
		session=HibernateUtil.getSessionFactory().openSession();
		tx= session.beginTransaction();
	}
	
	protected void manejaExcepcion(HibernateException he) {
		tx.rollback();
		throw new HibernateException("ERROR EN LA CAPA DE ACCESO DE DATOS", he);
	}
	
	public PersonalFestival traer(long idPersonalFestival) {
		PersonalFestival objeto = null;
		try {
		iniciaOperacion();
		objeto = (PersonalFestival) session.get(PersonalFestival.class, idPersonalFestival);
		}catch(HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public PersonalFestival traerPorDni(long dni) {
		PersonalFestival objeto = null;
		try {
		iniciaOperacion();
		objeto= (PersonalFestival) session.createQuery("from PersonalFestival p where p.dni = :dni")
				.setParameter("dni", dni)
				.uniqueResult();
		}catch(HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public List<PersonalFestival> traer(){
		List<PersonalFestival> staff= new ArrayList<PersonalFestival>();
		try {
			iniciaOperacion();
			Query<PersonalFestival> query= session.createQuery("from PersonalFestival p", PersonalFestival.class);
			staff= query.getResultList();
		}catch(HibernateException he) {
			manejaExcepcion(he);
		}finally {
			session.close();
		}
		return staff;
	}
	
	//CASO DE USO TRAER COCINEROS POR ESPECIALIDAD
	public List<Cocinero> traerCocinerosPorEspecialidad(String especialidad){
		List<Cocinero> cocineros = new ArrayList<Cocinero>();
		try {
			iniciaOperacion();
			Query<Cocinero> query = session.createQuery("FROM Cocinero c WHERE c.especialidad = :especialidad", Cocinero.class)
					.setParameter("especialidad", especialidad);
			cocineros= query.getResultList();
			}catch(HibernateException he) {
			manejaExcepcion(he);
		}finally {
			session.close();
		}
		return cocineros;
	}
	
	//CASO DE USO TRAER COCINEROS CON CARNET VENCIDO 
	public List<Cocinero> traerCocinerosCarnetVencido(LocalDate fecha){
		List<Cocinero> cocineros = new ArrayList<>();
	    try {
	        iniciaOperacion();
	        String hql = "from Cocinero c where c.fechaVencimientoCarnet <=: fecha";
	        cocineros = session.createQuery(hql, Cocinero.class)
	                       .setParameter("fecha", fecha)
	                       .getResultList();
			}catch(HibernateException he) {
			manejaExcepcion(he);
		}finally {
			session.close();
		}
		return cocineros;
	}
}

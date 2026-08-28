package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import datos.PersonalFestival;

public class PersonalFestivalDao {
	
	private static Session session;
	private static Transaction tx;
	
	private void iniciaOperacion() throws HibernateException{
		session=HibernateUtil.getSessionFactory().openSession();
		tx= session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) {
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
}

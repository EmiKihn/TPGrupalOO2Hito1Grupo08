package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import datos.Plato;

public class PlatoDao {

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
	
	public Plato traer(long idPlato) {
		Plato objeto = null;
		try {
		iniciaOperacion();
		objeto = (Plato) session.get(Plato.class, idPlato);
		}catch(HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public Plato traerPorNombre(String nombre) {
		Plato objeto = null;
		try {
		iniciaOperacion();
		objeto= (Plato) session.createQuery("from Plato p where p.nombre = :nombre")
				.setParameter("nombre", nombre)
				.uniqueResult();
		}catch(HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public List<Plato> traer() {
		List<Plato> lista = new ArrayList<Plato>();
		try {
		iniciaOperacion();
		Query<Plato> query = session.createQuery("from Plato p", Plato.class);
		lista = query.getResultList();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return lista;
	}
}


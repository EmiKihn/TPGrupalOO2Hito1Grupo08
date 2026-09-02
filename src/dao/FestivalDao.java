package dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import datos.Festival;

public class FestivalDao {
	
	private static Session session;
	private Transaction tx;
	private void iniciaOperacion() throws HibernateException {
	session = HibernateUtil.getSessionFactory().openSession();
	tx = session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
		}
	
	public Festival traer(long idFestival) throws HibernateException{
		Festival objeto = null;
		try {
		iniciaOperacion();
		objeto = (Festival) session.get(Festival.class, idFestival);
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public List<Festival> traer() throws HibernateException {
		List<Festival> lista = new ArrayList<Festival>();
		try {
		iniciaOperacion();
		Query<Festival> query = session.createQuery("from Festival f", Festival.class);
		lista = query.getResultList();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return lista;
		}
	
	public Festival traerFestivalYUnidadesDeVenta(long idFestival) throws HibernateException {
		Festival objeto = null;
		try {
		iniciaOperacion();
		String hql = "from Festival f where f.idFestival=:idFestival";
		objeto=(Festival) session.createQuery(hql).setParameter("idFestival", idFestival).uniqueResult();
		if (objeto != null) {
		    Hibernate.initialize(objeto.getUnidadesDeVenta()); //Por si no existe un festival con ese id
		}
		} catch (HibernateException he) {
			manejaExcepcion(he);
		}
		finally {
		session.close();
		}
		return objeto;
		}
	
	public Long traerCantidadUnidadesDeVenta(long idFestival) {
		Long cantidad = null;
		try {
			iniciaOperacion();
			String hql = "select count(u)"
					+ " from UnidadDeVenta u "
					+ "where u.festival.idFestival =:idFestival";
		cantidad = (Long) session.createQuery(hql).setParameter("idFestival", idFestival).uniqueResult();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
		return cantidad;
	}
	
	public List<Festival> traerFestivalesConXCantDeUnidades(long cantidad) {

	    List<Festival> lista = new ArrayList<Festival>();

	    try {
	        iniciaOperacion();
	        String hql = "select f "
	        		+ "from Festival f "
	        		+ "join f.unidadesDeVenta u "
	        		+ "group by f "
	        		+ "having count(u) > :cantidad";
	        lista = session.createQuery(hql, Festival.class)
	                .setParameter("cantidad", cantidad)
	                .getResultList();
	    } catch (HibernateException he) {
	        manejaExcepcion(he);
	    } finally {
	        session.close();
	    }
	    return lista;
	}

	
	
		}



package dao;
import java.util.ArrayList;
import java.util.List;

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
	
	public Festival traer(long idFestival) {
		Festival objeto = null;
		try {
		iniciaOperacion();
		objeto = (Festival) session.get(Festival.class, idFestival);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public List<Festival> traer() {
		List<Festival> lista = new ArrayList<Festival>();
		try {
		iniciaOperacion();
		Query<Festival> query = session.createQuery("from Festival f", Festival.class);
		lista = query.getResultList();
		} finally {
		session.close();
		}
		return lista;
		}
		}



package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.UnidadDeVenta;

public class UnidadDeVentaDao {

	protected Session session;
	protected Transaction tx;
	private static UnidadDeVentaDao instancia = null;

	protected UnidadDeVentaDao() {}

	public static UnidadDeVentaDao getInstance() {
		if (instancia == null)
			instancia = new UnidadDeVentaDao();
		return instancia;
	}

	protected void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	protected void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public long agregar(UnidadDeVenta objeto) throws HibernateException {
		long id = 0;
		try {
			iniciaOperacion();
			id = (long) session.save(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(UnidadDeVenta objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
	}

	public UnidadDeVenta traer(long idUnidadDeVenta) throws HibernateException {
		UnidadDeVenta objeto = null;
		try {
			iniciaOperacion();
			objeto = session.createQuery(
				"from UnidadDeVenta uv where uv.idUnidadDeVenta=:idUnidadDeVenta", UnidadDeVenta.class
			).setParameter("idUnidadDeVenta", idUnidadDeVenta).uniqueResult();
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
		return objeto;
	}

	public List<UnidadDeVenta> traer() throws HibernateException {
		List<UnidadDeVenta> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from UnidadDeVenta", UnidadDeVenta.class).list();
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
		return lista;
	}
}
package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import datos.DetallePedido;
import negocio.DetallePedidoABM;

public class DetallePedidoDao {

	private static Session session;
	private static Transaction tx;
	private static DetallePedidoDao instancia=null;
	
	public static DetallePedidoDao getInstance() {
		if(instancia==null) {
			instancia=new DetallePedidoDao();
		}
		return instancia;
	}
	
	private void iniciaOperacion() throws HibernateException{
		session=HibernateUtil.getSessionFactory().openSession();
		tx= session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) {
		tx.rollback();
		throw new HibernateException("ERROR EN LA CAPA DE ACCESO DE DATOS", he);
	}
	
	public DetallePedido traer(long idDetallePedido) {
		DetallePedido objeto = null;
		try {
		iniciaOperacion();
		String hql= "select d from DetallePedido d inner join fetch d.plato where d.idDetallePedido=:idDetallePedido";
		objeto = session.createQuery(hql,DetallePedido.class)
				.setParameter("idDetallePedido", idDetallePedido)
				.uniqueResult();
		}catch(HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public List<DetallePedido> traer() {
		List<DetallePedido> lista = new ArrayList<DetallePedido>();
		try {
		iniciaOperacion();
		Query<DetallePedido> query = session.createQuery("from DetallePedido d inner join fetch d.plato", DetallePedido.class);
		lista = query.getResultList();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return lista;
	}
}


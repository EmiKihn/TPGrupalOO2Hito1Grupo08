package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import datos.DetallePedido;

public class DetallePedidoDao {

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
	
	public DetallePedido traer(long idDetallePedido) {
	    DetallePedido objeto = null;
	    try {
	        iniciaOperacion();

	        objeto = session.createQuery(
	            "from DetallePedido d " +
	            "join fetch d.pedido " +
	            "join fetch d.plato " +
	            "where d.idDetallePedido = :id",
	            DetallePedido.class
	        )
	        .setParameter("id", idDetallePedido)
	        .uniqueResult();

	    } catch(HibernateException he) {
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
		Query<DetallePedido> query = session.createQuery(
			    "from DetallePedido d " +
			    "join fetch d.pedido " +
			    "join fetch d.plato",
			    DetallePedido.class
			);
		lista = query.getResultList();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return lista;
	}
}


package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import datos.Pedido;


public class PedidoDao {

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
	
	public Pedido traer(long idPedido) {
		Pedido objeto = null;
		try {
		iniciaOperacion();
		objeto = (Pedido) session.get(Pedido.class, idPedido);
		}catch(HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public Pedido traerPorFecha(LocalDate fechaTransaccion) {
		Pedido objeto = null;
		try {
		iniciaOperacion();
		objeto= (Pedido) session.createQuery("from Pedido p where p.fechaTransaccion = :fechaTransaccion")
				.setParameter("fechaTransaccion", fechaTransaccion)
				.uniqueResult();
		}catch(HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	public List<Pedido> traer() {
		List<Pedido> lista = new ArrayList<Pedido>();
		try {
		iniciaOperacion();
		Query<Pedido> query = session.createQuery("from Pedido p", Pedido.class);
		lista = query.getResultList();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return lista;
	}
}


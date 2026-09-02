package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import datos.Pedido;


public class PedidoDao {

	private static Session session;
	private static Transaction tx;
	private static PedidoDao instancia = null; 

	public static PedidoDao getInstancia() {
		if(instancia==null) {
			instancia= new PedidoDao();
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
	
	public Pedido traer(long idPedido) {
		Pedido objeto = null;
		try {
		iniciaOperacion();
		String hql="select p from Pedido p inner join fetch p.cajero inner join fetch p.unidadDeVenta inner join fetch p.detalles WHERE p.idPedido= :idPedido";
		objeto= session.createQuery(hql, Pedido.class)
				.setParameter("idPedido", idPedido)
				.uniqueResult();
		}catch(HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return objeto;
		}
	
	
	public List<Pedido> traer(LocalDate fechaDesde, LocalDate fechaHasta) {
		List<Pedido> lista = new ArrayList<Pedido>();
		try {
		iniciaOperacion();
		Query<Pedido> query = session.createQuery("select distinct p from Pedido p"
				+ " inner JOIN fetch p.cajero"
				+ " inner JOIN fetch p.unidadDeVenta "
				+ " inner JOIN fetch p.detalles d"
				+ " inner JOIN fetch d.plato "
				+ "WHERE p.fechaTransaccion >=: fechaDesde AND p.fechaTransaccion <=:fechaHasta", Pedido.class)
				.setParameter("fechaDesde", fechaDesde)
				.setParameter("fechaHasta",fechaHasta);
		lista = query.getResultList();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
		session.close();
		}
		return lista;
	}
}


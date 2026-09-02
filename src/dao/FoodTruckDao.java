package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import datos.FoodTruck;

public class FoodTruckDao extends UnidadDeVentaDao {

	private static FoodTruckDao instancia = null;

	protected FoodTruckDao() {}

	public static FoodTruckDao getInstance() {
		if (instancia == null)
			instancia = new FoodTruckDao();
		return instancia;
	}

	public FoodTruck traerPorPatente(String patente) throws HibernateException {
		FoodTruck objeto = null;
		try {
			iniciaOperacion();
			objeto = session.createQuery("from FoodTruck ft where ft.patente=:patente", FoodTruck.class).setParameter("patente", patente).uniqueResult();
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	
	public List<FoodTruck> traerConPersonalAsignado() throws HibernateException {
		List<FoodTruck> lista = null;
		try {
			iniciaOperacion();

			String hql = "from FoodTruck";
			lista = session.createQuery(hql, FoodTruck.class).list();

			for (FoodTruck ft : lista) {
				Hibernate.initialize(ft.getStaff());
			}

			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
		return lista;
	}


}



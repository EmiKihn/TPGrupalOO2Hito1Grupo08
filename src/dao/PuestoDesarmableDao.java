package dao;

import org.hibernate.HibernateException;
import datos.PuestoDesarmable;

public class PuestoDesarmableDao extends UnidadDeVentaDao {

	private static PuestoDesarmableDao instancia = null;

	protected PuestoDesarmableDao() {}

	public static PuestoDesarmableDao getInstance() {
		if (instancia == null)
			instancia = new PuestoDesarmableDao();
		return instancia;
	}

	public PuestoDesarmable traerPorCantidadCarpas(int cantidad) throws HibernateException {
		PuestoDesarmable objeto = null;
		try {
			iniciaOperacion();
			objeto = session.createQuery(
				"from PuestoDesarmable pd where pd.cantCarpas=:cantCarpas", PuestoDesarmable.class).setParameter("cantCarpas", cantidad).uniqueResult();
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
		return objeto;
	}
}
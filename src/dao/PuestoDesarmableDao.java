package dao;

import java.util.List;

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

	public List<PuestoDesarmable> traerPorCantidadCarpas(int cantidad) throws HibernateException {
	    List<PuestoDesarmable> lista = null;
	    try {
	        iniciaOperacion();
	        lista = session.createQuery(
	            "from PuestoDesarmable pd where pd.cantCarpas=:cantCarpas", PuestoDesarmable.class)
	            .setParameter("cantCarpas", cantidad).list(); 
	        tx.commit();
	    } catch (HibernateException he) {
	        manejaExcepcion(he);
	    } finally {
	        session.close();
	    }
	    return lista;
	}
}
package negocio;

import java.util.List;
import org.hibernate.HibernateException;
import dao.UnidadDeVentaDao;
import datos.UnidadDeVenta;

public class UnidadDeVentaABM {

	
	private static UnidadDeVentaABM instancia = null;

	protected UnidadDeVentaABM() {}

	public static UnidadDeVentaABM getInstance() {
		if (instancia == null)
			instancia = new UnidadDeVentaABM();
		return instancia;
	}
	
	public void actualizar(UnidadDeVenta objeto) throws HibernateException {
	    UnidadDeVentaDao.getInstance().actualizar(objeto);
	}
	
	public UnidadDeVenta traer(long idUnidadDeVenta) throws HibernateException {
		return UnidadDeVentaDao.getInstance().traer(idUnidadDeVenta);
	}

	public List<UnidadDeVenta> traer()throws HibernateException {
		return UnidadDeVentaDao.getInstance().traer();
	}
	
	
	
	
	
	
}

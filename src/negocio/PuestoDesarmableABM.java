package negocio;

import org.hibernate.HibernateException;
import dao.PuestoDesarmableDao;
import datos.Festival;
import datos.PuestoDesarmable;


public class PuestoDesarmableABM {

	private static PuestoDesarmableABM instancia = null; 

	protected PuestoDesarmableABM() {}

	public static PuestoDesarmableABM getInstance() {
		if (instancia == null)
			instancia = new PuestoDesarmableABM();
		return instancia;
	}
	
	
	public long agregarPuestoDesarmable(String nombre, double superficieOcupada, String codigo, Festival festival,
	        int cantCarpas, int tiempoMontaje) throws HibernateException {
	    return PuestoDesarmableDao.getInstance().agregar(
	        new PuestoDesarmable(nombre, superficieOcupada, codigo, festival, cantCarpas, tiempoMontaje)
	    );
	}
	
	

	public PuestoDesarmable traer(int cantidad)throws HibernateException {
		return PuestoDesarmableDao.getInstance().traerPorCantidadCarpas(cantidad);
	}

	

	
	
	
	
	
	
}

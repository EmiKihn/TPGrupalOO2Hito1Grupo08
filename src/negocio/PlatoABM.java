package negocio;

import java.util.List;

import dao.PlatoDao;
import datos.Plato;


public class PlatoABM {
	
	private static PlatoABM instancia = null;

	public static PlatoABM getInstancia() {
		if(instancia==null) {
			instancia=new PlatoABM();
		}
		return instancia;
	}
	
	public Plato traer(long idPlato) {
		return PlatoDao.getInstancia().traer(idPlato);
	}
	
	public List<Plato> traer() {
		return PlatoDao.getInstancia().traer();
	}
	
	public Plato traerPorNombre(String nombre) {
		return PlatoDao.getInstancia().traerPorNombre(nombre);
	}
private PlatoABM() {
		
	}
}

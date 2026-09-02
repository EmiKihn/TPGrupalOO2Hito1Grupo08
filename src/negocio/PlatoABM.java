package negocio;

import java.util.List;

import dao.PlatoDao;
import datos.Plato;


public class PlatoABM {

	PlatoDao dao = new PlatoDao();
	
	public Plato traer(long idPlato) {
		return dao.traer(idPlato);
	}
	
	public List<Plato> traer() {
		return dao.traer();
	}
	
	public Plato traerPorNombre(String nombre) {
		return dao.traerPorNombre(nombre);
	}
}

package negocio;

import java.util.List;

import dao.FestivalDao;
import datos.Festival;

public class FestivalABM {

	FestivalDao dao = new FestivalDao();
	
	public Festival traer(long idFestival) {
		return dao.traer(idFestival);
	}
	
	public List<Festival> traer() {
		return dao.traer();
	}
	
	public Festival traerFestivalYUnidad(long idFestival) {
		return dao.traerFestivalYUnidadesDeVenta(idFestival);
	}
	
	public Long traerCantidadUnidadesDeVenta(long idFestival) {
		return dao.traerCantidadUnidadesDeVenta(idFestival);
	}
	
	public List<Festival>traerFestivalesConXCantDeUnidades(long cantidad){
		return dao.traerFestivalesConXCantDeUnidades(cantidad);
		
				}
}

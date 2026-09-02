package negocio;

import java.util.List;

import dao.FestivalDao;
import datos.Festival;

public class FestivalABM {

	private static FestivalABM instancia = null;
	
	public static FestivalABM getInstance() {
		if(instancia==null) {
			instancia= new FestivalABM();
		}
		return instancia;
	}
	
	public Festival traer(long idFestival) {
		return FestivalDao.getInstance().traer(idFestival);
	}
	
	public List<Festival> traer() {
		return FestivalDao.getInstance().traer();
	}
	
	public Festival traerFestivalYUnidad(long idFestival) {
		return FestivalDao.getInstance().traerFestivalYUnidadesDeVenta(idFestival);
	}
	
	public Long traerCantidadUnidadesDeVenta(long idFestival) {
		return FestivalDao.getInstance().traerCantidadUnidadesDeVenta(idFestival);
	}
	
	public List<Festival>traerFestivalesConXCantDeUnidades(long cantidad){
		return FestivalDao.getInstance().traerFestivalesConXCantDeUnidades(cantidad);
	}
}

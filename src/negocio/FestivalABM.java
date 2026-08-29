package negocio;

import java.time.LocalDate;
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
}

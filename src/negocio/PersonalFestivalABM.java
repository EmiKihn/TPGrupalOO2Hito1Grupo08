package negocio;

import java.util.List;
import dao.PersonalFestivalDao;
import datos.PersonalFestival;
import datos.Cocinero;
public class PersonalFestivalABM {
	PersonalFestivalDao dao = new PersonalFestivalDao();
	
	public PersonalFestival traer(long idPersonalFestival) {
		return dao.traer(idPersonalFestival);
	}
	
	public PersonalFestival traerPorDni(long dni) {
		return dao.traerPorDni(dni);
	}
	
	public List<PersonalFestival> traer(){
		return dao.traer();
	}
	
	public List<Cocinero> traerCocinerosPorEspecialidad(String especialidad){
		return dao.traerCocineroPorEspecialidad(especialidad);
	}
}

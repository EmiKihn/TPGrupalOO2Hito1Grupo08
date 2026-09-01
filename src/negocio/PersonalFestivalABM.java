package negocio;

import java.time.LocalDate;
import java.util.List;
import dao.PersonalFestivalDao;
import datos.PersonalFestival;
import datos.Cocinero;
public class PersonalFestivalABM {
	private static PersonalFestivalABM instancia= null;
	
	public static PersonalFestivalABM getInstance() {
		if(instancia==null) {
			instancia= new PersonalFestivalABM();
		}
		return instancia;
	}
	
	public PersonalFestival traer(long idPersonalFestival) {
		return PersonalFestivalDao.getInstance().traer(idPersonalFestival);
	}
	
	public PersonalFestival traerPorDni(long dni) {
		return PersonalFestivalDao.getInstance().traerPorDni(dni);
	}
	
	public List<PersonalFestival> traer(){
		return PersonalFestivalDao.getInstance().traer();
	}
	
	public PersonalFestival traerRepresentantePorUnidad(long idUnidad) {
		return PersonalFestivalDao.getInstance().traerRepresentantePorUnidad(idUnidad);
	}
	public List<Cocinero> traerCocinerosPorEspecialidad(String especialidad){
		return PersonalFestivalDao.getInstance().traerCocinerosPorEspecialidad(especialidad);
	}
	
	public List<Cocinero> traerCocinerosCarnetVencido(LocalDate fecha){
		return PersonalFestivalDao.getInstance().traerCocinerosCarnetVencido(fecha);
	}
	

}


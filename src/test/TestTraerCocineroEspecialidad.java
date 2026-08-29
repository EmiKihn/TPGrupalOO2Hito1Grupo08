package test;

import negocio.PersonalFestivalABM;
import datos.Cocinero;

import java.util.ArrayList;
import java.util.List;
public class TestTraerCocineroEspecialidad {

	public static void main(String[] args) {
		PersonalFestivalABM abm = new PersonalFestivalABM();
		List<Cocinero> cocinerosEspecialidad = new ArrayList<Cocinero>();
		String especialidadA = "sushi";
		String especialidadB= "hamburgesas";
		
		cocinerosEspecialidad= abm.traerCocinerosPorEspecialidad(especialidadA);
		System.out.printf("COCINEROS POR ESPECIALIDAD %s \n %s \n", especialidadA, cocinerosEspecialidad.toString());
		
		cocinerosEspecialidad= abm.traerCocinerosPorEspecialidad(especialidadB);
		System.out.printf("COCINEROS POR ESPECIALIDAD %s \n %s \n", especialidadB, cocinerosEspecialidad.toString());

	}

}


package test;

import negocio.PersonalFestivalABM;
import datos.Cocinero;

import java.util.ArrayList;
import java.util.List;
public class TestTraerCocineroEspecialidad {

	public static void main(String[] args) {
		List<Cocinero> cocinerosEspecialidad = new ArrayList<Cocinero>();
		String especialidadA = "sushi";
		String especialidadB= "hamburgesas";
		
		cocinerosEspecialidad= PersonalFestivalABM.getInstance().traerCocinerosPorEspecialidad(especialidadA);
		System.out.printf("COCINEROS POR ESPECIALIDAD %s \n %s \n", especialidadA, cocinerosEspecialidad.toString());
		
		cocinerosEspecialidad= PersonalFestivalABM.getInstance().traerCocinerosPorEspecialidad(especialidadB);
		System.out.printf("COCINEROS POR ESPECIALIDAD %s \n %s \n", especialidadB, cocinerosEspecialidad.toString());

	}

}


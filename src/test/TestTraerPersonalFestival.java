package test;

import negocio.PersonalFestivalABM;
import datos.PersonalFestival;

import java.util.List;
public class TestTraerPersonalFestival {
	
	public static void main(String[] args) {
		PersonalFestivalABM personalAbm = new PersonalFestivalABM();
		long idPersonal= 1;
		long dni=11111111;
		PersonalFestival p = personalAbm.traer(idPersonal);
		PersonalFestival pDni= personalAbm.traerPorDni(dni);
		List<PersonalFestival> pLista= personalAbm.traer();
		System.out.print("TRAER POR ID: ");
		System.out.println(p.toString());
		System.out.print("TRAER POR DNI: ");
		System.out.println(pDni.toString());
		System.out.print("TRAER LISTA DE PERSONAL: ");
		System.out.println(pLista.toString());
	}
}

package test;

import datos.Festival;
import negocio.FestivalABM;

public class TestTraerFestival {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FestivalABM abm = new FestivalABM();
		System.out.println("Test traer todos los festivales:\n");
		for (Festival f: abm.traer()) {
			System.out.println(f);
		}
		System.out.println("Traer festival con id 1:\n");
		System.out.println(abm.traer(1));
		System.out.println("Traer todas las unidades de venta del festival 1:\n");
		System.out.println(abm.traerFestivalYUnidad(1));
		
		System.out.println(abm.traerFestivalesConXCantDeUnidades(5));
		
	}

}

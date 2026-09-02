package test;

import datos.Festival;
import negocio.FestivalABM;
import java.util.List;
public class TestEmilianoEzequielKihnTraerFestival {
	public static void main(String[] args) {
		List<Festival> lista= FestivalABM.getInstance().traer();
		System.out.println("Test traer todos los festivales:");
		for (Festival f: lista) {
			System.out.println(f);
		}
		System.out.println("\n------------------------\n");
		System.out.println("Traer festival con id 1:");
		System.out.println(FestivalABM.getInstance().traer(1));
		System.out.println("Traer todas las unidades de venta del festival 1:");
		System.out.println(FestivalABM.getInstance().traerFestivalYUnidad(1));
		System.out.println("\n------------------------\n");
		
	
	}

}

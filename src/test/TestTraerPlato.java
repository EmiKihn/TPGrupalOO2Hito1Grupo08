package test;

import datos.Plato;
import negocio.PlatoABM;

public class TestTraerPlato {

	public static void main(String[] args) {

		
		PlatoABM abm = new PlatoABM();
		System.out.println("Test traer todos los platos:\n");
		for (Plato p: abm.traer()) {
			System.out.println(p);
		}
		
		System.out.println("Traer plato con id 1:\n");
		System.out.println(abm.traer(1));
		
		String nombre = "nombre";
		System.out.println("Traer el plato " + nombre + ":\n");
		System.out.println(abm.traerPorNombre(nombre));
		
	}

}

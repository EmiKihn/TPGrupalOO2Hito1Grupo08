package test;

import java.util.List;

import datos.Pedido;
import datos.Plato;
import negocio.PedidoABM;
import negocio.PlatoABM;

public class TestGinoRicciardulliTraerPlato {

	public static void main(String[] args) {

		
		System.out.println("Test traer todos los platos:\n");
		for (Plato p: PlatoABM.getInstancia().traer()) {
			System.out.println(p);
		}
		
		System.out.println("Traer plato con id 1:\n");
		System.out.println(PlatoABM.getInstancia().traer(1));
		
		String nombre = "nombre";
		System.out.println("Traer el plato " + nombre + ":\n");
		System.out.println(PlatoABM.getInstancia().traerPorNombre(nombre));
		
	}

}

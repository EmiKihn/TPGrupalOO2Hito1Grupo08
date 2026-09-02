package test;

import java.time.LocalDate;

import datos.Pedido;
import negocio.PedidoABM;

public class TestTraerPedido {

	public static void main(String[] args) {
		
		PedidoABM abm = new PedidoABM();
		System.out.println("Test traer todos los pedidos:\n");
		for (Pedido p: abm.traer()) {
			System.out.println(p);
		}
		System.out.println("Traer pedido con id 1:\n");
		System.out.println(abm.traer(1));
		
		LocalDate fecha = LocalDate.now();
		System.out.println("Traer pedidos de la fecha actual:\n");
		System.out.println(abm.traerPorFecha(fecha));
		
	}


}

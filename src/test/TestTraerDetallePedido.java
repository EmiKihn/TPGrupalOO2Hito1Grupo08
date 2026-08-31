package test;

import datos.DetallePedido;
import negocio.DetallePedidoABM;

public class TestTraerDetallePedido {
	public static void main(String[] args) {
		
		DetallePedidoABM abm = new DetallePedidoABM();
		System.out.println("Test traer todos los detalle pedidos:\n");
		for (DetallePedido d: abm.traer()) {
			System.out.println(d);
		}
		
		System.out.println("Traer detalle pedido con id 1:\n");
		System.out.println(abm.traer(1));
		
		System.out.println("Traer detalle pedido con id 2:\n");
		System.out.println(abm.traerPorId(2));
		
	}

}

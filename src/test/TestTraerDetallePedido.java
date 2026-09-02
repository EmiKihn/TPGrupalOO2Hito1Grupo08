package test;

import datos.DetallePedido;
import negocio.DetallePedidoABM;

public class TestTraerDetallePedido {
	public static void main(String[] args) {
		DetallePedido dp=DetallePedidoABM.getInstance().traer(1);
		System.out.println("Traer detalle pedido con id 1:");
		System.out.printf("%s\n", dp.toString());
		System.out.printf("%s", dp.getPlato());
		
		System.out.println("Test traer todos los detalle pedidos:\n");
		for (DetallePedido d: DetallePedidoABM.getInstance().traer()) {
			System.out.printf("%s\n", d.toString());
			System.out.printf("%s\n", d.getPlato());
		}
	}
}

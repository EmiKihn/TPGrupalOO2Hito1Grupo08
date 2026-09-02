package test;

import java.time.LocalDate;
import java.util.List;

import datos.DetallePedido;
import datos.Pedido;
import negocio.PedidoABM;

public class TestTraerPedido {

	public static void main(String[] args) {
		LocalDate fechaDesde= LocalDate.of(2026, 9, 20);
		LocalDate fechaHasta= LocalDate.of(2026, 9, 25);
		List<Pedido> lista= PedidoABM.getInstancia().traer(fechaDesde, fechaHasta);
		//ENCABEZADO
		System.out.println("\n==================================================");
		System.out.println("              REPORTE DE PEDIDOS                   ");
		System.out.println("==================================================");
		
		for (Pedido p : lista) {

		    System.out.printf("TICKET NRO: %04d | FECHA: %s\n", p.getIdPedido(), p.getFechaTransaccion());
		    System.out.printf("PUESTO: %s\n", p.getUnidadDeVenta().getNombre()); 
		    System.out.printf("CAJERO/A: %s %s\n", p.getCajero().getNombre(), p.getCajero().getApellido());
		    
		    System.out.println("--------------------------------------------------");
		    System.out.printf("%-5s | %-25s | %-10s\n", "CANT", "PLATO", "SUBTOTAL");
		    System.out.println("--------------------------------------------------");
			double total=0.0;
			Double subtotal=0.0;
			//CUERPO
		    for (DetallePedido detalle : p.getDetalles()) {
		    	subtotal= detalle.getCantidad() * detalle.getPrecioDeVenta();
		        total += detalle.getCantidad() * detalle.getPrecioDeVenta();
		        System.out.printf("%-5d | %-25s | $%.2f\n", 
		                          detalle.getCantidad(), 
		                          detalle.getPlato().getNombre(), 
		                          subtotal);
		    }
		    //PIE
		    System.out.println("--------------------------------------------------");
		    System.out.printf("%-33s   $%.2f\n", "TOTAL A PAGAR: ", total);
		    System.out.println("==================================================\n");
		}
	}
}

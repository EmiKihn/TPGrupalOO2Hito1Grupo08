package test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import datos.DetallePedido;
import negocio.DetallePedidoABM;

public class TestGinoRicciardulliTraerDetallePedido {
    public static void main(String[] args) {


        LocalDate desde = LocalDate.of(2026, 9, 1);
        LocalDate hasta = LocalDate.of(2026, 9, 30);


        List<DetallePedido> lista = DetallePedidoABM.getInstance().traerMasVendidos(desde, hasta);
        
        Map<String, Integer> cantidades = new HashMap<>();
        Map<String, Double> facturacion = new HashMap<>();


        System.out.println("\n=====================================================");
        System.out.println("           REPORTE DE PLATOS VENDIDOS");
        System.out.println("=====================================================");

        System.out.printf("%-20s %-15s %-15s%n", "PLATO", "TOTAL VENDIDO", "FACTURACION");

        System.out.println("-----------------------------------------------------");

        for(DetallePedido d : lista) {

        	String nombre = d.getPlato().getNombre();
            int cantidad = d.getCantidad();
            double subtotal = cantidad * d.getPrecioDeVenta();

            cantidades.put(nombre, cantidades.getOrDefault(nombre, 0) + cantidad);
            facturacion.put(nombre, facturacion.getOrDefault(nombre, 0.0) + subtotal);
        }
        
        for(String plato : cantidades.keySet()) {

            System.out.printf("%-20s %-15d $%.2f%n",
                    plato,
                    cantidades.get(plato),
                    facturacion.get(plato));

        }

        System.out.println("=====================================================");

    }
}

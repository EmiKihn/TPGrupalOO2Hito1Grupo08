package test;

import java.util.List;

import datos.Plato;
import negocio.PlatoABM;

public class TestGinoRicciardulliTraerPlato {

	public static void main(String[] args) {

		
		double costoMaximo = 3500;
        double precioMinimo = 5500;

        List<Plato> lista = PlatoABM.getInstancia()
                .traer(costoMaximo, precioMinimo);


        System.out.println("\n==================================================");
        System.out.println("          REPORTE DE PLATOS RENTABLES");
        System.out.println("==================================================");

        for (Plato p : lista) {

            double ganancia = p.getPrecioDeVenta() - p.getCostoDeProduccion();

            System.out.printf(
                "PLATO: %s | COSTO: $%.2f | PRECIO: $%.2f | GANANCIA: $%.2f%n",
                p.getNombre(),
                p.getCostoDeProduccion(),
                p.getPrecioDeVenta(),
                ganancia
            );

        }

        System.out.println("==================================================");
        System.out.println("Cantidad encontrados: " + lista.size());
    }
}

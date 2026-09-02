package test;

import java.util.List;
import datos.Festival;
import negocio.FestivalABM;

public class TestCantidadUnidadesVentaEnFestival {
	public static void main(String[] args) {
		List<Festival> lista= FestivalABM.getInstance().traerFestivalesConXCantDeUnidades(0);
		for (Festival f: lista) {
			System.out.println(f);
		}
	}
}

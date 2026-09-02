package test;

import java.util.List;
import datos.Festival;
import negocio.FestivalABM;

public class TestTraerFestivalesConXCantDeUnidades{
	public static void main(String[] args) {
		int cant=2;
		List<Festival> lista= FestivalABM.getInstance().traerFestivalesConXCantDeUnidades(cant);
		System.out.printf("FESTIVALES CON %d UNIDADES DE VENTA O MÁS:\n", cant);
		for (Festival f: lista) {
			System.out.println(f);
		}
	}
}


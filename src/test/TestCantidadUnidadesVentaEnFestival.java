package test;

import datos.Festival;
import dao.FestivalDao;

public class TestCantidadUnidadesVentaEnFestival {
	public static void main(String[] args) {
		
		FestivalDao abm = new FestivalDao();
		// TODO Auto-generated method stub
	System.out.println("Cantidad de unidades del festival 1: "+ abm.traerCantidadUnidadesDeVenta(1));
	}
}

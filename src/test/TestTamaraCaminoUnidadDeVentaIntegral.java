package test;
import java.util.List;
import java.util.Set;

import datos.FoodTruck;
import datos.PersonalFestival;
import datos.UnidadDeVenta;
import negocio.FoodTruckABM;
import negocio.UnidadDeVentaABM;

public class TestTamaraCaminoUnidadDeVentaIntegral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            
			System.out.println("-------CU 1 ---------");
			System.out.println("TRAER LISTA DE UNIDAD DE VENTA");

			List<UnidadDeVenta> unidades = UnidadDeVentaABM.getInstance().traer();
			for (UnidadDeVenta unidad : unidades) {
			    System.out.println(unidad);
			}
            
            System.out.println("-------CU 2 ---------");
    		System.out.println("TRAER POR PATENTE:");
            // traer patente en FoodTruck
            FoodTruck ft = FoodTruckABM.getInstance().traer("AD789GH");///Reemplazar "AD789GH" con una patente valida del script SQL 
            System.out.println("FoodTruck traido por patente: " + ft);
            
            System.out.println("-------CU 3 ---------");
            System.out.println("TRAER FOODTRUCK CON SU PERSONAL ASIGNADO");
            List<FoodTruck> lista = FoodTruckABM.getInstance().traerConPersonal();

			if (lista == null || lista.isEmpty()) {
				System.out.println("No se encontraron FoodTrucks con personal asignado.");
				return;
			}

			for (FoodTruck ft3 : lista) {
			    System.out.println(ft3);

			    Set<PersonalFestival> staff = ft3.getStaff();
			    if (staff.isEmpty()) {
			        System.out.println("  -> Sin personal asignado");
			    } else {
			        for (PersonalFestival p : staff) {
			            System.out.println("  -> " + p);
			        }
			    }

			    System.out.println();
			} 
			
			
	
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            e.printStackTrace();
        }
		
			
	}

}



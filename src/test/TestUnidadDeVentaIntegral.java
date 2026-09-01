package test;
import java.util.List;
import datos.FoodTruck;
import datos.UnidadDeVenta;
import negocio.FoodTruckABM;
import negocio.UnidadDeVentaABM;

public class TestUnidadDeVentaIntegral {

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
            
   
    		
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            e.printStackTrace();
        }
		
			
	}

}



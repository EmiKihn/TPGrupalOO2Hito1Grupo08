package negocio;

import java.util.List;

import org.hibernate.HibernateException;
import dao.FoodTruckDao;
import datos.Festival;
import datos.FoodTruck;

public class FoodTruckABM {

	private static FoodTruckABM instancia = null; 

	protected FoodTruckABM() {}

	public static FoodTruckABM getInstance() {
		if (instancia == null)
			instancia = new FoodTruckABM();
		return instancia;
	}
	
	
	public long agregarFoodTruck(String nombre, double superficieOcupada, String codigo, Festival festival,
	        String patente, boolean requiereElectricidad) throws HibernateException {
	    return FoodTruckDao.getInstance().agregar(
	        new FoodTruck(nombre, superficieOcupada, codigo, festival, patente, requiereElectricidad));
	}
	
	
	public FoodTruck traer(String patente)throws HibernateException {
		return FoodTruckDao.getInstance().traerPorPatente(patente);
	}

	public List<FoodTruck> traerTodos() throws HibernateException {
	    return FoodTruckDao.getInstance().traerTodos();
	}
	
	
}

package datos;

public class FoodTruck extends UnidadDeVenta {
	private long idFoodTruck;
	private String patente;
	private boolean requiereElectricidad;
	
	public FoodTruck() {}

	public FoodTruck( String nombre, double superficieOcupada, String codigo, Festival festival,
			String patente, boolean requiereElectricidad) {
		super( nombre, superficieOcupada, codigo, festival);
		this.patente = patente;
		this.requiereElectricidad = requiereElectricidad;
	}

	public long getIdFoodTruck() {
		return idFoodTruck;
	}

	protected void setIdFoodTruck(long idFoodTruck) {
		this.idFoodTruck = idFoodTruck;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public boolean isRequiereElectricidad() {
		return requiereElectricidad;
	}

	public void setRequiereElectricidad(boolean requiereElectricidad) {
		this.requiereElectricidad = requiereElectricidad;
	}

	@Override
	public String toString() {
		return "FoodTruck ["+ super.toString() + "patente=" + patente + ", requiereElectricidad=" + requiereElectricidad + "]";
	}

	

	

}

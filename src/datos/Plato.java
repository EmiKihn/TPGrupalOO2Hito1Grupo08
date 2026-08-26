package datos;

public class Plato {
	private long idPlato;
	private String nombre;
	private double costoDeProduccion;
	private double precioDeVenta;
	
	public Plato() {}

	public Plato(String nombre, double costoDeProduccion, double precioDeVenta) {
		super();
		this.nombre = nombre;
		this.costoDeProduccion = costoDeProduccion;
		this.precioDeVenta = precioDeVenta;
	}


	public long getIdPlato() {
		return idPlato;
	}


	protected void setIdPlato(long idPlato) {
		this.idPlato = idPlato;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getCostoDeProduccion() {
		return costoDeProduccion;
	}


	public void setCostoDeProduccion(double costoDeProduccion) {
		this.costoDeProduccion = costoDeProduccion;
	}


	public double getPrecioDeVenta() {
		return precioDeVenta;
	}


	public void setPrecioDeVenta(double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}


	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", costoDeProduccion=" + costoDeProduccion + ", precioDeVenta="
				+ precioDeVenta + "]";
	};
	
	
}

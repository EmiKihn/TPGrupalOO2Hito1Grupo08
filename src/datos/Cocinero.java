package datos;

import java.time.LocalDate;
public class Cocinero extends PersonalFestival {
	private String especialidad;
	private double plusFijo;
	private LocalDate fechaVencimientoCarnet;
	
	public Cocinero () {}

	public Cocinero(String nombre, String apellido, long dni, LocalDate fechaIngreso, boolean representante,
			LocalDate fechaNacimiento, String especialidad, double plusFijo,
			LocalDate fechaVencimientoCarnet) {
		super(nombre, apellido, dni, fechaIngreso, representante, fechaNacimiento);
		this.especialidad = especialidad;
		this.plusFijo = plusFijo;
		this.fechaVencimientoCarnet = fechaVencimientoCarnet;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public double getPlusFijo() {
		return plusFijo;
	}

	public void setPlusFijo(double plusFijo) {
		this.plusFijo = plusFijo;
	}

	public LocalDate getFechaVencimientoCarnet() {
		return fechaVencimientoCarnet;
	}

	public void setFechaVencimientoCarnet(LocalDate fechaVencimientoCarnet) {
		this.fechaVencimientoCarnet = fechaVencimientoCarnet;
	}

	@Override
	public String toString() {
		return "Cocinero ["+super.toString()+", especialidad=" + especialidad + ", plusFijo=" + plusFijo
				+ ", fechaVencimientoCarnetDeManipulacion=" + fechaVencimientoCarnet + "] \n";
	}
	
	
	
}

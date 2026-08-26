package datos;

import java.time.LocalDate;

public class Cajero extends PersonalFestival {
	private long idCajero;
	private String turno;
	private double recaudacionTotal;
	
	public Cajero() {}

	public Cajero(String nombre, String apellido, long dni, LocalDate fechaIngreso,
			boolean representante, LocalDate fechaNacimiento, String turno, double recaudacionTotal) {
		super(nombre, apellido, dni, fechaIngreso, representante, fechaNacimiento);
		this.turno = turno;
		this.recaudacionTotal = recaudacionTotal;
	}

	public long getIdCajero() {
		return idCajero;
	}

	protected void setIdCajero(long idCajero) {
		this.idCajero = idCajero;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getRecaudacionTotal() {
		return recaudacionTotal;
	}

	public void setRecaudacionTotal(double recaudacionTotal) {
		this.recaudacionTotal = recaudacionTotal;
	}

	@Override
	public String toString() {
		return "Cajero ["+super.toString()+", turno=" + turno + ", recaudacionTotal=" + recaudacionTotal + "]";
	}
	

	
	
	
}

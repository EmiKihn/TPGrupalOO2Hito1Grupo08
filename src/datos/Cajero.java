package datos;

import java.time.LocalDate;

public class Cajero extends PersonalFestival {
	private String turno;
	private double recaudacionTotal;
	
	public Cajero() {}

	public Cajero(String nombre, String apellido, long dni, LocalDate fechaIngreso,
			boolean representante, LocalDate fechaNacimiento, String turno) {
		super(nombre, apellido, dni, fechaIngreso, representante, fechaNacimiento);
		this.turno = turno;
		this.recaudacionTotal = 0.0;
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
		return "Cajero ["+super.toString()+", turno=" + turno + ", recaudacionTotal=" + recaudacionTotal + "]\n";
	}
	

	
	
	
}

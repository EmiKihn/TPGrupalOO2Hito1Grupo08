package datos;

import java.time.LocalDate;
import java.util.Set;
public class Festival {
	private long idFestival;
	private String nombre;
	private String temporada;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double costoPorM2;
	private double costoPorMontaje;
	private double sueldoBase;
	private Set<UnidadDeVenta> unidadesDeVenta;
	
	public Festival() {}


	public Festival(String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin, double costoPorM2,
			double costoPorMontaje, double sueldoBase) {
		super();
		this.nombre = nombre;
		this.temporada = temporada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costoPorM2 = costoPorM2;
		this.costoPorMontaje = costoPorMontaje;
		this.sueldoBase = sueldoBase;
	}


	public long getIdFestival() {
		return idFestival;
	}


	protected void setIdFestival(long idFestival) {
		this.idFestival = idFestival;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTemporada() {
		return temporada;
	}


	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}


	public LocalDate getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public LocalDate getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}


	public double getCostoPorM2() {
		return costoPorM2;
	}


	public void setCostoPorM2(double costoPorM2) {
		this.costoPorM2 = costoPorM2;
	}


	public double getCostoPorMontaje() {
		return costoPorMontaje;
	}


	public void setCostoPorMontaje(double costoPorMontaje) {
		this.costoPorMontaje = costoPorMontaje;
	}


	public double getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	public Set<UnidadDeVenta> getUnidadesDeVenta() {
		return unidadesDeVenta;
	}


	public void setUnidadesDeVenta(Set<UnidadDeVenta> unidadesDeVenta) {
		this.unidadesDeVenta = unidadesDeVenta;
	}


	@Override
	public String toString() {
		return "Festival [nombre=" + nombre + ", temporada=" + temporada + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + "]";
	};
	
	
}

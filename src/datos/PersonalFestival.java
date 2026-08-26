package datos;

import java.time.LocalDate;

public abstract class PersonalFestival {
	protected long idPersonalFestival;
	protected String nombre;
	protected String apellido;
	protected long dni;
	protected LocalDate fechaIngreso;
	protected boolean representante;
	protected LocalDate fechaNacimiento;
	
	public PersonalFestival() {}

	public PersonalFestival(String nombre, String apellido, long dni, LocalDate fechaIngreso,boolean representante, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaIngreso = fechaIngreso;
		this.representante = representante;
		this.fechaNacimiento = fechaNacimiento;
	}

	public long getIdPersonalFestival() {
		return idPersonalFestival;
	}

	protected void setIdPersonalFestival(long idPersonalFestival) {
		this.idPersonalFestival = idPersonalFestival;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public boolean isRepresentante() {
		return representante;
	}

	public void setRepresentante(boolean representante) {
		this.representante = representante;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "PersonalFestival [idPersonalFestival=" + idPersonalFestival + ", nombre=" + nombre + ", apellido="
				+ apellido + ", dni=" + dni + ", fechaIngreso=" + fechaIngreso + ", representante=" + representante + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalFestival other = (PersonalFestival) obj;
		return dni == other.dni;
	};
	
	
}

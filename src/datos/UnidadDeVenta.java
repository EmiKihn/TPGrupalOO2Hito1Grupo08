package datos;

import java.util.Set;

public abstract class UnidadDeVenta {
	protected long idUnidadDeVenta;
	protected String nombre;
	protected double superficieOcupada;
	protected String codigo;
	protected Festival festival;
	protected Set<PersonalFestival> staff;
	protected Set<Plato> platos;
	protected Set<Pedido> pedidos;
	
	public UnidadDeVenta() {}

	public UnidadDeVenta( String nombre, double superficieOcupada, String codigo,
			Festival festival) {
		super();
		this.nombre = nombre;
		this.superficieOcupada = superficieOcupada;
		this.codigo = codigo;
		this.festival = festival;
	}

	public long getIdUnidadDeVenta() {
		return idUnidadDeVenta;
	}

	protected void setIdUnidadDeVenta(long idUnidadDeVenta) {
		this.idUnidadDeVenta = idUnidadDeVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSuperficieOcupada() {
		return superficieOcupada;
	}

	public void setSuperficieOcupada(double superficieOcupada) {
		this.superficieOcupada = superficieOcupada;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Festival getFestival() {
		return festival;
	}

	public void setFestival(Festival festival) {
		this.festival = festival;
	}

	public Set<PersonalFestival> getStaff() {
		return staff;
	}

	public void setStaff(Set<PersonalFestival> staff) {
		this.staff = staff;
	}

	public Set<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(Set<Plato> platos) {
		this.platos = platos;
	}


	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "UnidadDeVenta [idUnidadDeVenta=" + idUnidadDeVenta + ", nombre=" + nombre + ", superficieOcupada="
				+ superficieOcupada + ", codigo=" + codigo + " ";
	};
	
	
	
}

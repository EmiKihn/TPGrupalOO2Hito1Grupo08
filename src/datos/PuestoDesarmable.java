package datos;

public class PuestoDesarmable extends UnidadDeVenta{
	private long idPuestoDesarmable;
	private int cantCarpas;
	private int tiempoMontaje;
	
	public PuestoDesarmable() {}

	public PuestoDesarmable(String nombre, double superficieOcupada, String codigo, Festival festival, int cantCarpas,
			int tiempoMontaje) {
		super(nombre, superficieOcupada, codigo, festival);
		this.cantCarpas = cantCarpas;
		this.tiempoMontaje = tiempoMontaje;
	}

	public long getIdPuestoDesarmable() {
		return idPuestoDesarmable;
	}

	protected void setIdPuestoDesarmable(long idPuestoDesarmable) {
		this.idPuestoDesarmable = idPuestoDesarmable;
	}

	public int getCantCarpas() {
		return cantCarpas;
	}

	public void setCantCarpas(int cantCarpas) {
		this.cantCarpas = cantCarpas;
	}

	public int getTiempoMontaje() {
		return tiempoMontaje;
	}

	public void setTiempoMontaje(int tiempoMontaje) {
		this.tiempoMontaje = tiempoMontaje;
	}
	
	@Override
	public String toString() {
		return "PuestoDesarmable ["+ super.toString() +"cantCarpas=" + cantCarpas + ", tiempoMontaje=" + tiempoMontaje + "]";
	};
	
	
}

package datos;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
public class Pedido {
	private long idPedido;
	private LocalDate fechaTransaccion;
	private Cajero cajero;
	private UnidadDeVenta unidadDeVenta;
	private List<DetallePedido> detalles= new ArrayList<DetallePedido>();
	
	public Pedido() {}

	public Pedido(LocalDate fechaTransaccion, Cajero cajero, UnidadDeVenta unidadDeVenta) {
		super();
		this.fechaTransaccion = fechaTransaccion;
		this.cajero = cajero;
		this.unidadDeVenta = unidadDeVenta;
	}

	public long getIdPedido() {
		return idPedido;
	}

	protected void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(LocalDate fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public UnidadDeVenta getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(UnidadDeVenta unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

	public List<DetallePedido> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetallePedido> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "Pedido [fechaTransaccion=" + fechaTransaccion + ", cajero=" + cajero + ", unidadDeVenta="
				+ unidadDeVenta + "]";
	};
	
	
	
	
}

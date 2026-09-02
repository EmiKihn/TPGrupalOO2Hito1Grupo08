package datos;

public class DetallePedido {
	private long idDetallePedido;
	private int cantidad;
	private double precioDeVenta;
	private Pedido pedido;
	private Plato plato;
	public DetallePedido() {}

	public DetallePedido(Plato plato, int cantidad) {
		super();
		this.plato=plato;
		this.cantidad = cantidad;
		this.precioDeVenta = plato.getPrecioDeVenta();
	}

	public long getIdDetallePedido() {
		return idDetallePedido;
	}

	protected void setIdDetallePedido(long idDetallePedido) {
		this.idDetallePedido = idDetallePedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioDeVenta() {
		return precioDeVenta;
	}

	public void setPrecioDeVenta(double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}
	
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	@Override
	public String toString() {
		return "DetallePedido [cantidad=" + cantidad + ", precioDeVenta=" + precioDeVenta +"]";
	}


	
	
	
}

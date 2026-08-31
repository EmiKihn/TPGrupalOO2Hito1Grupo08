package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.PedidoDao;
import datos.Pedido;

public class PedidoABM {

	PedidoDao dao = new PedidoDao();
	
	public Pedido traer(long idPedido) {
		return dao.traer(idPedido);
	}
	
	public List<Pedido> traer() {
		return dao.traer();
	}
	
	public Pedido traerPorFecha(LocalDate fechaTransaccion) {
		return dao.traerPorFecha(fechaTransaccion);
	}
}

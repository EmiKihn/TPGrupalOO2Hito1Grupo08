package negocio;

import java.util.List;

import dao.DetallePedidoDao;
import datos.DetallePedido;

public class DetallePedidoABM {

	DetallePedidoDao dao = new DetallePedidoDao();
	
	public DetallePedido traer(long idDetallePedido) {
		return dao.traer(idDetallePedido);
	}
	
	public List<DetallePedido> traer() {
		return dao.traer();
	}
}

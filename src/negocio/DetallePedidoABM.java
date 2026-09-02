package negocio;

import java.util.List;

import dao.DetallePedidoDao;
import datos.DetallePedido;

public class DetallePedidoABM {
	private static DetallePedidoABM instancia=null;
	
	public static DetallePedidoABM getInstance() {
		if(instancia==null) {
			instancia=new DetallePedidoABM();
		}
		return instancia;
	}
	
	public DetallePedido traer(long idDetallePedido) {
		return DetallePedidoDao.getInstance().traer(idDetallePedido);
	}
	
	public List<DetallePedido> traer() {
		return DetallePedidoDao.getInstance().traer();
	}
}

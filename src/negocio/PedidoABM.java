package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.PedidoDao;
import datos.Pedido;

public class PedidoABM {
	private static PedidoABM instancia= null;
	
	public static PedidoABM getInstancia() {
		if(instancia==null) {
			instancia=new PedidoABM();
		}
		return instancia;
	}

	public Pedido traer(long idPedido) {
		return PedidoDao.getInstancia().traer(idPedido);
	}
	
	public List<Pedido> traer(LocalDate fechaDesde, LocalDate fechaHasta) {
		return PedidoDao.getInstancia().traer(fechaDesde, fechaHasta);
	}
}

package com.navent.app.main;
import com.navent.app.controller.PedidosController;
import com.navent.app.model.Pedido;


public class Main {

	public static void main(String[] args) {
		PedidosController pedidosController = new PedidosController();
		Pedido pedido = new Pedido("Producto 1", 3800.99f, 100f);
		pedidosController.create(pedido);
		
		pedido.setDescuento(50f);
		pedidosController.update(pedido);
		
		pedidosController.delete(pedido);
	}

}

package com.navent.app.dao;

import java.util.Random;

import com.navent.app.exception.DbException;
import com.navent.app.model.Pedido;

/**
 * This class has the utilities for data access objects.
 * @author Daniel Interlandi
 *
 */
public class PedidosDAO {
	
	/**
	 * Inserts or updates a {@link Pedido} on DB.
	 * @param pedido Instance of {@link Pedido}.
	 * @throws DbException DB exception.
	 */
	public void insertOrUpdate(Pedido pedido) throws DbException {
		if(pedido.getId() == 0) {
			pedido.setId(new Random().nextLong()); // Mock of identifier.
			System.out.println("Inserting new Pedido " + pedido.getId() + " on DB.");
			//throw new DbException("Error inserting a new Pedido.");
		} else {
			System.out.println("Updating Pedido " + pedido.getId() + " on DB.");
			//throw new DbException("Error updating Pedido. id=" + pedido.getId());
		}
	}
	
	/**
	 * Deletes a {@link Pedido} from DB.
	 * @param pedido Instance of {@link Pedido}.
	 * @throws DbException DB exception.
	 */
	public void delete(Pedido pedido) throws DbException {
		System.out.println("Removing Pedido " + pedido.getId() + " from DB.");
		//throw new DbException("Error deleting Pedido. id=" + pedido.getId());
	}
	
	/**
	 * Fetches a {@link Pedido} from DB.
	 * @param idPedido {@link Pedido} identifier.
	 * @return Instance of {@link Pedido}.
	 * @throws DbException DB exception.
	 */
	public Pedido select(long idPedido)  throws DbException {
		System.out.println("Fetching Pedido " + idPedido + " from DB.");
		//throw new DbException("Error fetching Pedido. id=" + idPedido);
		return new Pedido();
	}
}

package com.navent.app.controller;

import com.navent.app.cache.BumexMemcached;
import com.navent.app.dao.PedidosDAO;
import com.navent.app.exception.CacheException;
import com.navent.app.exception.DbException;
import com.navent.app.model.Pedido;

/**
 * Manages the functionality to opeate with Pedidos.
 * @author Daniel Interlandi
 *
 */
public class PedidosController {
	private PedidosDAO dao;
	private BumexMemcached cache;
	
	/**
	 * Constructs a {@link PedidosController}.
	 */
	public PedidosController() {
		dao = new PedidosDAO();
		cache = BumexMemcached.getInstance();
	}

	/**
	 * Creates a new Pedido.
	 * @param pedido Instance of {@link Pedido} to create.
	 */
	public void create(Pedido pedido) {
		try {
			dao.insertOrUpdate(pedido);
			cache.set(String.valueOf(pedido.getId()), pedido);
		} catch (DbException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (CacheException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * Updates a Pedido.
	 * @param pedido Instance of {@link Pedido} to update.
	 */
	public void update(Pedido pedido) {
		try {
			dao.insertOrUpdate(pedido);
			cache.set(String.valueOf(pedido.getId()), pedido);
		} catch (DbException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (CacheException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets a Pedido.
	 * @param idPedido Identifier of of {@link Pedido}.
	 * @return Instance of {@link Pedido}.
	 */
	public Pedido get(long idPedido) {
		Pedido pedido = null;
		try {
			pedido = dao.select(idPedido);
			if(pedido == null) {
				pedido = (Pedido) cache.get(String.valueOf(idPedido));
			}
		} catch (DbException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (CacheException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
		return pedido;
	}
	
	/**
	 * Deletes a Pedido.
	 * @param pedido Instance of {@link Pedido} to delete.
	 */
	public void delete(Pedido pedido) {
		try {
			dao.delete(pedido);
			cache.delete(String.valueOf(pedido.getId()));
		} catch (DbException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (CacheException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

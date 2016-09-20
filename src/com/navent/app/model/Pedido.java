package com.navent.app.model;

/**
 * This class represents the customer orders.
 * @author Daniel Interlandi
 */
public class Pedido {
	private long id;
	private String nombre;
	private float monto;
	private float descuento;
	
	/**
	 * Constructs a {@link Pedido}.
	 */
	public Pedido() {
		super();
	}
	
	/**
	 * Constructs a {@link Pedido}.
	 * @param nombre The {@link Pedido} name.
	 * @param monto The {@link Pedido} amount.
	 * @param descuento The {@link Pedido} discount.
	 */
	public Pedido(String nombre, float monto, float descuento) {
		super();
		this.nombre = nombre;
		this.monto = monto;
		this.descuento = descuento;
	}

	/**
	 * Constructs a {@link Pedido}.
	 * @param id The {@link Pedido} identifier.
	 * @param nombre The {@link Pedido} name.
	 * @param monto The {@link Pedido} amount.
	 * @param descuento The {@link Pedido} discount.
	 */
	public Pedido(long id, String nombre, float monto, float descuento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.monto = monto;
		this.descuento = descuento;
	}

	/**
	 * Gets the {@link Pedido} identifier.
	 * @return The {@link Pedido} identifier.
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the {@link Pedido} identifier.
	 * @param id The {@link Pedido} identifier.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the {@link Pedido} name.
	 * @return The {@link Pedido} name.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the {@link Pedido} name.
	 * @param nombre The {@link Pedido} name.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the {@link Pedido} amount.
	 * @return The {@link Pedido} amount.
	 */
	public float getMonto() {
		return monto;
	}

	/**
	 * Sets the {@link Pedido} amount.
	 * @param monto The {@link Pedido} amount.
	 */
	public void setMonto(float monto) {
		this.monto = monto;
	}

	/**
	 * Gets the {@link Pedido} discount.
	 * @return The {@link Pedido} discount.
	 */
	public float getDescuento() {
		return descuento;
	}

	/**
	 * Sets the {@link Pedido} discount.
	 * @param descuento The {@link Pedido} discount.
	 */
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	/**
	 * Prints a {@link Pedido}.
	 */
	public String toString() {
		return "Pedido [id=" + id + ", nombre=" + nombre + ", monto=" + monto
				+ ", descuento=" + descuento + "]";
	}
}

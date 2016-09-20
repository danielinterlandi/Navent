package com.navent.app.exception;

/**
 * Represents a DB Exception.
 * @author Daniel Interlandi
 *
 */
public class DbException extends Exception {
	private static final long serialVersionUID = 186888648026965414L;

	/**
	 * Constructs a new exception with the specified detail message.
	 * @param message The detail message.
	 */
	public DbException(String message) {
		super(message);
	}
}

package com.navent.app.exception;

/**
 * Represents a Memcached Exception.
 * @author Daniel Interlandi
 *
 */
public class CacheException extends Exception {
	private static final long serialVersionUID = -2084108672431282259L;

	/**
	 * Constructs a new exception with the specified detail message.
	 * @param message The detail message.
	 */
	public CacheException(String message) {
		super(message);
	}
}
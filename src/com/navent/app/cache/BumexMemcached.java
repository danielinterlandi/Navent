package com.navent.app.cache;

import com.navent.app.exception.CacheException;

/**
 * This class has the utilities for Memcached.
 * @author Daniel Interlandi
 *
 */
public class BumexMemcached {
	private static BumexMemcached instance;

	/**
	 * Gets an instance of {@link BumexMemcached}.
	 * @return An instance of {@link BumexMemcached}.
	 */
	public static synchronized BumexMemcached getInstance() {
		if (instance == null) {
			instance = new BumexMemcached();
		}
		return instance;
	}
	
	/**
	 * Associates the specified value with the specified key. 
	 * @param key Key with which the specified value is to be associated.
	 * @param value Value to be associated with the specified key.
	 * @throws CacheException Memcached exception.
	 */
	public void set(String key, Object value) throws CacheException {
		System.out.println("Setting key " + key + " with value " + value + " on cache.");
		//throw new CacheException("Error setting key " + key + " on cache.");
	}
	
	/**
	 * Gets the value to which the specified key is mapped.
	 * @param key The key whose associated value is to be returned.
	 * @return The value to which the specified key is mapped.
	 * @throws CacheException Memcached exception.
	 */
	public Object get(String key) throws CacheException {
		System.out.println("Fetching key " + key + " from cache.");
		//throw new CacheException("Error fetching key " + key + " from cache.");
		return new Object();
	}
	
	/**
	 * Removes the mapping for the specified key.
	 * @param key Key whose mapping is to be removed.
	 * @throws CacheException Memcached exception.
	 */
	public void delete(String key) throws CacheException {
		System.out.println("Removing key " + key + " from cache.");
		//throw new CacheException("Error removing key " + key + " from cache.");
	} 
}
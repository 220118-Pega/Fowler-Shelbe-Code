package com.revature.dl;
/**
 * This is a generic interface for DAOs
 * @author shelbefowler
 *
 * @param <T>
 */
	
public interface DAO<T, K> {
 T findbyId(K id);
	Iterable<T> findAll();
	void add(T newObject);
	void update(T newObject);

}

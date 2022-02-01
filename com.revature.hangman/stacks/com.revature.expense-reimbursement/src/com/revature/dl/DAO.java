package com.revature.dl;

import java.util.List;

import com.revature.bl.Solution;

/**
 * This is a generic interface for DAOs
 * @author shelbefowler
 *
 * @param <T>
 */
	
public interface DAO<T, K> {
	T findbyId(K id);
	List<T> findAll();
	void add(T newObject);
	void update(T newObject);

}

package com.joyrace.spring.dao;

import java.util.List;

import com.joyrace.spring.model.Racetrack;

/**
 * Defines DAO operations for the racetrack model.
 * @author www.codejava.net
 *
 */
public interface RaceTrackDAO {
	
	public void saveOrUpdate(Racetrack racetrack);
	
	public void delete(int racetrackId);
	
	public Racetrack get(int racetrackId);
	
	public List<Racetrack> list();
}

package com.joyrace.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joyrace.spring.dao.RaceTrackDAO;
import com.joyrace.spring.model.User;

@Service("raceTrackService")
@Transactional
public class RaceTrackServiceImpl implements RaceTrackService {

	@Autowired
	private RaceTrackDAO raceTrackDAO;

	public void updateUser(User user) {
	}

}

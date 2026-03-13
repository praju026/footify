package com.footify.service;

import java.util.List;

import com.footify.entity.Trophy;

public interface TrophyService {

	List<Trophy> getAllTrophies();
	Trophy addTrophyToClub(long club_id,Trophy trophy);
	
	
}

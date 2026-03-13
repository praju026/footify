package com.footify.service;

import java.util.List;

import com.footify.entity.Club;

public interface ClubService {

	Club addClub(Club club);
	List<Club> getAllClub(Club club);
	Club getClubById(long id);
}

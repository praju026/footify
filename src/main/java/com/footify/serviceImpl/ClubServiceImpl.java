package com.footify.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footify.entity.Club;
import com.footify.repository.ClubRepository;
import com.footify.service.ClubService;

@Service
public class ClubServiceImpl implements ClubService {

	@Autowired
	private ClubRepository clubRepository;
	
	@Override
	public Club addClub(Club club) {
		
		return clubRepository.save(club);
	}

	@Override
	public List<Club> getAllClub(Club club) {
	
		return clubRepository.findAll();
	}

	@Override
	public Club getClubById(long id) {
		
		return clubRepository.findById(id).orElseThrow();
	}

}

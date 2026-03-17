package com.footify.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footify.entity.Club;
import com.footify.repository.ClubRepository;
import com.footify.service.ClubService;
import com.praju.footify.exception.ResourceNotFoundException;

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
		Club club = clubRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Club With Given Not Found "+id));
		return club;
	}

}

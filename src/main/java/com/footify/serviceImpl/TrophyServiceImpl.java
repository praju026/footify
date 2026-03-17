package com.footify.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footify.entity.Club;
import com.footify.entity.Trophy;
import com.footify.repository.ClubRepository;
import com.footify.repository.TrophyRepository;
import com.footify.service.TrophyService;
import com.praju.footify.exception.ResourceNotFoundException;

@Service
public class TrophyServiceImpl implements TrophyService {
	@Autowired
	private TrophyRepository TrophyRepository;
	@Autowired
	private ClubRepository clubRepository;
	@Override
	public List<Trophy> getAllTrophies() {
		// TODO Auto-generated method stub
		return TrophyRepository.findAll();
	}

	@Override
	public Trophy addTrophyToClub(long club_id, Trophy trophy) {
		Club club = clubRepository.findById(club_id).orElseThrow(() -> new ResourceNotFoundException("No Club Available with id "+club_id));
		trophy.setClub(club);
		return TrophyRepository.save(trophy);
	}

}

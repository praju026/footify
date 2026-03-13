package com.footify.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.footify.entity.Club;
import com.footify.entity.Player;
import com.footify.repository.ClubRepository;
import com.footify.repository.PlayerRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;
	@Autowired
	private ClubRepository clubRepository;
	
	@GetMapping("/players")
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}
	
	
	@PostMapping("/players/club/{club_id}")
	public Player addPlayerToClub(@PathVariable long club_id,@RequestBody Player player) {
		Club club = clubRepository.findById(club_id).orElseThrow();
		player.setClub(club);
		return playerRepository.save(player);
	}
	
	 
	
}

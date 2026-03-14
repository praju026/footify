package com.footify.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.footify.dto.PlayerResponseDTO;
import com.footify.entity.Club;
import com.footify.entity.Player;
import com.footify.repository.ClubRepository;
import com.footify.service.PlayerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private ClubRepository clubRepository;
	
	@GetMapping("/players")
	public List<PlayerResponseDTO> getAllPlayers() {
		return playerService.getAllPlayer();
	}
	
	
	@PostMapping("/players/club/{club_id}")
	public Player addPlayerToClub(@PathVariable long club_id,@RequestBody Player player) {
		Club club = clubRepository.findById(club_id).orElseThrow();
		player.setClub(club);
		return playerService.addPlayer(player);
	}
	
	 
	
}

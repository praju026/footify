package com.footify.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footify.entity.Player;
import com.footify.repository.PlayerRepository;
import com.footify.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<Player> getAllPlayer() {
		
		return playerRepository.findAll();
	}

	@Override
	public Player addPlayer(Player player) {
		
		return playerRepository.save(player);
	}

	@Override
	public Player getPlayerById(long id) {
		
		return playerRepository.findById(id).orElseThrow();
	}

}

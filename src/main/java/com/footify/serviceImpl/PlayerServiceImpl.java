package com.footify.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footify.dto.PlayerResponseDTO;
import com.footify.entity.Player;
import com.footify.repository.PlayerRepository;
import com.footify.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<PlayerResponseDTO> getAllPlayer() {
		
		return playerRepository.findAll()
				.stream()
				.map(this :: mapToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public Player addPlayer(Player player) {
		
		return playerRepository.save(player);
	}

	@Override
	public PlayerResponseDTO getPlayerById(long id) {
		Player player = playerRepository.findById(id).orElseThrow();
		return mapToDTO(player);
	}

	private PlayerResponseDTO mapToDTO(Player player ) {
		
		return new PlayerResponseDTO(
				player.getId(), 
				player.getName(), 
				player.getPosition(), 
				player.getJerseyNumber(), 
				player.getNationality(), 
				player.getAge(),
				player.getClub() !=null ? player.getClub().getName() :null
						);
	}
	
}

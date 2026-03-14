package com.footify.service;

import java.util.List;

import com.footify.dto.PlayerResponseDTO;
import com.footify.entity.Player;

public interface PlayerService {

	List<PlayerResponseDTO> getAllPlayer();
	Player addPlayer(Player player);
	PlayerResponseDTO getPlayerById(long id);
}

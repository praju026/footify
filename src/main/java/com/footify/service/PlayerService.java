package com.footify.service;

import java.util.List;

import com.footify.entity.Player;

public interface PlayerService {

	List<Player> getAllPlayer();
	Player addPlayer(Player player);
	Player getPlayerById(long id);
}

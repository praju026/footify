package com.footify.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footify.entity.Club;
import com.footify.entity.Player;
import com.footify.entity.Transfer;
import com.footify.repository.ClubRepository;
import com.footify.repository.PlayerRepository;
import com.footify.repository.TransferRepository;
import com.footify.service.TransferService;
import com.footify.exception.ResourceNotFoundException;

@Service 
public class TransferServiceImpl implements TransferService {

	@Autowired
	private TransferRepository transferRepository;
	
	@Autowired
	private ClubRepository clubRepository;
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<Transfer> getAllTransfer() {
		return transferRepository.findAll();
	}

	@Override
	public Transfer addTransfer(long player_id, Transfer transfer) {
		Player player = playerRepository.findById(player_id)
				.orElseThrow(() -> new ResourceNotFoundException("Player with ID " + player_id + " not found"));
		transfer.setPlayer(player);
		Transfer saveTransfer = transferRepository.save(transfer);
		
		Club newClub = clubRepository.findByName(transfer.getToClub())
				.orElseThrow(() -> new ResourceNotFoundException("Club with name " + transfer.getToClub() + " not found"));
		player.setClub(newClub);
		playerRepository.save(player);
		return saveTransfer;
	}

	@Override
	public List<Transfer> getTransferByPlayer(long player_id) {
		return transferRepository.findByPlayerId(player_id);
	}

}

package com.footify.serviceImpl;

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
		// TODO Auto-generated method stub
		return transferRepository.findAll();
	}

	@Override
	public Transfer addTransfer(long player_id, Transfer transfer ) {
		Player player = playerRepository.findById(player_id).orElseThrow();
		transfer.setPlayer(player);
		Transfer saveTransfer = transferRepository.save(transfer);
		
		Club newClub = clubRepository.findByName(transfer.getToClub()).orElseThrow();
		player.setClub(newClub);
		playerRepository.save(player);
		return saveTransfer;
	}

	@Override
	public Transfer getTransferByPlayer(long player_id) {
		// TODO Auto-generated method stub
		return transferRepository.findById(player_id).orElseThrow();
	}

}

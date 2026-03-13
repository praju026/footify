package com.footify.service;

import java.util.List;

import com.footify.entity.Transfer;

public interface TransferService {

	List<Transfer> getAllTransfer();
	Transfer getTransferByPlayer (long player_id);
	Transfer addTransfer(long player_id, Transfer transfer);
	
}

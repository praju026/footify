package com.footify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footify.entity.Transfer;
import com.footify.serviceImpl.TransferServiceImpl;

import jakarta.validation.Valid;

@RestController

@RequestMapping("/transfers")
public class TransferController {

	@Autowired
	private TransferServiceImpl serviceImpl;
	
	@GetMapping
	public List<Transfer> getAllTransfers(){
		
		return serviceImpl.getAllTransfer();
	}
	@GetMapping("/player/{player_id}")
	public Transfer getTransfersByPlayer(@PathVariable @Valid Long player_id){
		return serviceImpl.getTransferByPlayer(player_id);
	}
	
	@PostMapping("/player/{player_id}")
	public Transfer addTransfer(@PathVariable @Valid long player_id, @RequestBody @Valid Transfer transfer) {
		
		return serviceImpl.addTransfer(player_id, transfer);
	}
	
}

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
import com.footify.service.TransferService;

import jakarta.validation.Valid;

@RestController

@RequestMapping("/transfers")
public class TransferController {

	@Autowired
	private TransferService transferService;
	
	@GetMapping
	public List<Transfer> getAllTransfers(){
		return transferService.getAllTransfer();
	}
	
	@GetMapping("/player/{player_id}")
	public List<Transfer> getTransfersByPlayer(@PathVariable Long player_id){
		return transferService.getTransferByPlayer(player_id);
	}
	
	@PostMapping("/player/{player_id}")
	public Transfer addTransfer(@PathVariable long player_id, @RequestBody @Valid Transfer transfer) {
		return transferService.addTransfer(player_id, transfer);
	}
	
}

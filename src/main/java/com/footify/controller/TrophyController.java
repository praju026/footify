package com.footify.controller;

import org.springframework.web.bind.annotation.RestController;


import com.footify.entity.Trophy;
import com.footify.serviceImpl.TrophyServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/trophies")
public class TrophyController {

	@Autowired
	private TrophyServiceImpl impl;
	
	@GetMapping
	public List<Trophy> getAllTrophies() {
		
		
		return impl.getAllTrophies();
	}
	
	@PostMapping("/club/{club_id}")
	public Trophy addTrophyToClub(@PathVariable long club_id,@RequestBody Trophy trophy) {
		
		return impl.addTrophyToClub(club_id, trophy);
		
	}
		
	
	
}

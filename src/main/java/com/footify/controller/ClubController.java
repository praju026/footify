package com.footify.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footify.entity.Club;
import com.footify.serviceImpl.ClubServiceImpl;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/clubs")
public class ClubController {

	@Autowired
	private ClubServiceImpl impl;
	
	@GetMapping
	public List<Club> getAllClubs(@Valid Club club) {
		
		return impl.getAllClub(club);
	}
	@PostMapping 
	public Club addClub(@RequestBody @Valid Club club) {
		
		return impl.addClub(club);
	}
	
	@GetMapping("/{id}")
	public Club getClubById(@PathVariable @Valid long id) {
		return impl.getClubById(id);
	}
}

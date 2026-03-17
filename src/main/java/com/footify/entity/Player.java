package com.footify.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank(message = "Id Required")
	private long id;
	
	@NotBlank(message = "Name Required")
	private String name;
	
	@NotBlank(message = "Position Required")
	private String position;
	
	@NotBlank(message = "Jersey Number Required")
	@Min(value = 1,message = "Jersey Number has to Start From 1")
	private long jerseyNumber;
	
	@NotBlank(message = "Nationality Required")
	private String nationality;
	
	@NotBlank(message = "Age Required")
	@Min(value = 14,message = "minimum age 14 Required")
	private long age;
	
	@ManyToOne
	@JoinColumn(name = "club_id")
	private Club club;
	
	@OneToMany(mappedBy = "player")
	@JsonIgnore
	private List<Transfer>transfers;
	
	public Player(){
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPostion(String position) {
		this.position = position;
	}
	public long getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(long jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public List<Transfer> getTransfers() {
		return transfers;
	}

	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}


	
	
}

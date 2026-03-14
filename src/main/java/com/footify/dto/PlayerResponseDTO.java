package com.footify.dto;

public class PlayerResponseDTO {

	private long id;
	private String name;
	private String position;
	private long jerseyNumber;
	private String nationality;
	private long age;
	private String clubName;
	
	public PlayerResponseDTO() {
		super();
	}

	public PlayerResponseDTO(long id, String name, String position, long jerseyNumber, String nationality, long age,String clubName ){
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.jerseyNumber = jerseyNumber;
		this.nationality = nationality;
		this.age = age;
		this.clubName=clubName;
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

	public void setPosition(String position) {
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

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	
}

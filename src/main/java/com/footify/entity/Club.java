package com.footify.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String country;
	private String stadium;
	private long foundedYear;
	private String coach;
	private String logoUrl;
	
	@OneToMany(mappedBy = "club")
	@JsonIgnore
	private List<Player> players;
	@OneToMany(mappedBy = "club")
	@JsonIgnore
	private List<Trophy>trophies;
	
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public long getFoundedYear() {
		return foundedYear;
	}
	public void setFoundedYear(long foundedYear) {
		this.foundedYear = foundedYear;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public List<Trophy> getTrophies() {
		return trophies;
	}
	public void setTrophies(List<Trophy> trophies) {
		this.trophies = trophies;
	}
	
}

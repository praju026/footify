package com.footify.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Club name cannot be blank")
	private String name;
	
	@NotBlank(message = "Country is required")
	private String country;
	
	@NotBlank(message = "Stadium is required")
	private String stadium;
	
	@Min(value = 1800, message = "Founded year must be valid")
	private long foundedYear;
	
	@NotBlank(message = "Coach name is required")
	private String coach;
	
	@NotBlank(message = "Logo URL is required")
	private String logoUrl;
	
	@OneToMany(mappedBy = "club")
	@JsonIgnore
	private List<Player> players;
	
	@OneToMany(mappedBy = "club")
	@JsonIgnore
	private List<Trophy> trophies;
	
}

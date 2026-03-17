package com.footify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Transfer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank(message = "Required Field")
	private long id;
	
	@NotBlank(message = "Required Field")
	private String fromClub;
	
	@NotBlank(message = "Required Field")
	private String toClub;
	
	@NotBlank(message = "Required Field")
	private String transferFee;
	
	@NotBlank(message = "Required Field")
	private String transferDate;
	
	@ManyToOne
	@JoinColumn(name = "player_id")
	private Player player;
	
	public Transfer() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFromClub() {
		return fromClub;
	}

	public void setFromClub(String fromClub) {
		this.fromClub = fromClub;
	}

	public String getToClub() {
		return toClub;
	}

	public void setToClub(String toClub) {
		this.toClub = toClub;
	}

	public String getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(String transferFee) {
		this.transferFee = transferFee;
	}

	public String getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
}

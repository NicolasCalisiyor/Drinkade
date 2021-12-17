package com.otp1r16.model;

import javax.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

/*
 * PlayerDAO class for storing the players information.
 */
@Entity(name = "PLAYER")
@Table(name = "PLAYER_INFORMATION")
@DynamicUpdate
public class Player {
	
	@Id @GeneratedValue
	private int id;

	@Column(name = "PLAYER_NAME", nullable=false)
	private String playerName;
	
	@Column(name = "PLAYER_AGE")
	private int playerAge = 0;
	
	@Column(name = "PLAYER_DRINK_COUNT")
	private int drinkCount = 0;
		
	public Player() {}
	
	public Player(String playerName, int playerAge, int drinkCount) {
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.drinkCount = drinkCount;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return playerName;		
	}
		
	public void setName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getAge() {
		return playerAge;	
	}
	
	public void setAge(int playerAge) {
		this.playerAge = playerAge;
	}
	
	public int getDrinkCount() {
		return drinkCount;
	}
	
	public void setDrinkCount(int drinkCount) {
		this.drinkCount = drinkCount;
	}
	
	@Override
	public String toString() {
		return playerName + " " + drinkCount;		
	}
}

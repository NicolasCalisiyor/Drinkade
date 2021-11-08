package com.otp1r16.model;
import javax.persistence.*;

@Entity
@Table(name = "PLAYER_INFORMATION")
public class Player {
	
	@Id @GeneratedValue
	private int id;

	@Column(name = "PLAYER_NAME", nullable=false)
	private String playerName;
	
	@Column(name = "PLAYER_AGE")
	private int playerAge = 0;
	
	@Column(name = "PLAYER_DRINK_COUNT")
	private int drinkCount = 0;
		
	public Player() {
		
	}
	
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
		
	public void setName(String PlayerName) {
		this.playerName = PlayerName;
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
}

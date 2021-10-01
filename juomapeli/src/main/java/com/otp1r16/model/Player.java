package com.otp1r16.model;

public class Player {

	private String PlayerName;
	private int Age;
	
	public Player() {
		
	}
	
	public Player(String PlayerName, int Age) {
		this.PlayerName = PlayerName;
		this.Age = Age;
	}
	
	public String getName() {
		return PlayerName;		
	}
	
	public int getAge() {
		return Age;	
	}
	
	public void setName(String PlayerName) {
		this.PlayerName = PlayerName;
	}
	
	public void setAge(int Age) {
		this.Age = Age;
	}
}

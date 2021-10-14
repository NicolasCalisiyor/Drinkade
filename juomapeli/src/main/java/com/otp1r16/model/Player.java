package com.otp1r16.model;

public class Player {

	private String PlayerName;
	private int Age = 0;
	private int DoCount = 0;
	
	public Player() {
		
	}
	
	public Player(String PlayerName, int Age, int DoCount) {
		this.PlayerName = PlayerName;
		this.Age = Age;
		this.DoCount = DoCount;
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
	
	public int getDoCount() {
		return DoCount;
	}
	
	public void setDoCount(int DoCount) {
		this.DoCount = DoCount;
	}
}

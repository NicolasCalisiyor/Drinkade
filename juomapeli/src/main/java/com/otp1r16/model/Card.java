package com.otp1r16.model;

public class Card {
	
	private String Description;
	private int GameNumber;
	private int DrinkAmount;
	
	public Card() {
		
	}
	
	public Card(String Description, int GameNumber, int DrinkAmount) {
		this.Description = Description;
		this.GameNumber = GameNumber;
		this.DrinkAmount = DrinkAmount;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getGameNumber() {
		return GameNumber;
	}

	public void setGameNumber(int gameNumber) {
		GameNumber = gameNumber;
	}

	public int getDrinkAmount() {
		return DrinkAmount;
	}

	public void setDrinkAmount(int drinkAmount) {
		DrinkAmount = drinkAmount;
	}
	

}

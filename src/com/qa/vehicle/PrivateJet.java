package com.qa.vehicle;

public class PrivateJet extends Vehicle{
	
	private int numberOfSeats;
	private String nameOfPilot;
	private String nameOfHostess;
	
	public PrivateJet(int id, String type, String make, String model, int price, boolean isClean, boolean needsFixing,
			int numberOfSeats, String nameOfPilot, String nameOfHostess) {
		super(id, type, make, model, price, isClean, needsFixing);
		this.numberOfSeats = numberOfSeats;
		this.nameOfPilot = nameOfPilot;
		this.nameOfHostess = nameOfHostess;
		this.setType("Plane");
	}
	
	public int getNumber_of_seats() {
		return numberOfSeats;
	}
	public void setNumber_of_seats(int number_of_seats) {
		this.numberOfSeats = number_of_seats;
	}
	public String getNameOfPilot() {
		return nameOfPilot;
	}
	public void setNameOfPilot(String nameOfPilot) {
		this.nameOfPilot = nameOfPilot;
	}
	public String getNameOfHostess() {
		return nameOfHostess;
	}
	public void setNameOfHostess(String nameOfHostess) {
		this.nameOfHostess = nameOfHostess;
	}
	
	
	
	
	
	

}

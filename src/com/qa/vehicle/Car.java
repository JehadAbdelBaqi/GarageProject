package com.qa.vehicle;

public class Car extends Vehicle {
	
	
	private int numberOfSeats;
	private int sizeOfRims;
//	private String type = "Car";
	
	public Car(int id, String type, String make, String model, int price, boolean isClean, boolean needsFixing, int numberOfSeats, int sizeOfRims) {
		super(id, type, make, model, price, isClean, needsFixing);
		this.numberOfSeats = numberOfSeats;
		this.sizeOfRims = sizeOfRims;
		this.setType(type = "Car");
		
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getSizeOfRims() {
		return sizeOfRims;
	}

	public void setSizeOfRims(int sizeOfRims) {
		this.sizeOfRims = sizeOfRims;
	}

	@Override
	public String toString() {
		return "Cars [numberOfSeats=" + numberOfSeats + ", sizeOfRims=" + sizeOfRims +
				super.toString() + "]";
	}


}

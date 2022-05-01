package com.qa.vehicle;

public class Motorbikes extends Vehicle {
	
	private int numberOfWheels;
	private boolean naked;
	
	public Motorbikes(int id, String type, String make, String model, int price, boolean isClean, boolean needsFixing,
			int numberOfWheels, boolean naked) {
		super(id, type, make, model, price, isClean, needsFixing);
		this.numberOfWheels = numberOfWheels;
		this.naked = naked;
		this.setType("Motorbike");
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public boolean isNaked() {
		return naked;
	}

	public void setNaked(boolean naked) {
		this.naked = naked;
	}
	
	
	
}

package com.qa.vehicle;

public abstract class Vehicle {
	
	private int id;
	private String type;
	private String make;
	private String model;
	private int price;
	private boolean isClean;
	private boolean needsFixing;
	
	
	public Vehicle(int id, String type, String make, String model, int price, boolean isClean, boolean needsFixing) {
		this.id = id;
		this.type = type;
		this.make = make;
		this.model = model;
		this.price = price;
		this.isClean = isClean;
		this.needsFixing = needsFixing;
	}
	
	

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public boolean isClean() {
		return isClean;
	}


	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}


	public boolean isNeedsFixing() {
		return needsFixing;
	}


	public void setNeedsFixing(boolean needsFixing) {
		this.needsFixing = needsFixing;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String returnType() {
		return this.type;
	}
	
	public int returnId(int id) {
		return this.id;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", make=" + make + ", model=" + model + ", price=" + price + ", isClean="
				+ isClean + ", needsFixing=" + needsFixing + "]";
	}
	
	
	
	
	
	}


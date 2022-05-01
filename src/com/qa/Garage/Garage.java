package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;
import com.qa.vehicle.Vehicle;

public class Garage {

	private List<Vehicle> garageStorage = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		this.garageStorage.add(v);
	}
	

	public void removeVehicle(Vehicle v) {
		this.garageStorage.remove(v);
	}
	

	public void clearGarage() {
		this.garageStorage.clear();
	}
	

	public int checkPriceForfix(String type) {
		int carPrice = 100;
		int jetPrice = 10000;
		int motorbikePrice = 150;
		int price = 0;

		if (type == "Car") {
			price = carPrice;
		} else if (type == "Plane") {
			price = jetPrice;
		} else if (type == "Motorbike") {
			price = motorbikePrice;
		} else {
			return 0;
		}
		return price;
	}
	

	public void getDeets() {
		for (Vehicle vehicle : this.garageStorage) {
			System.out.println(vehicle.getType());
		}
	}
	

	public int checkAndFix(Vehicle v) {
		if (v.isNeedsFixing()) {
			return this.checkPriceForfix(v.getType());
		} else {
			return 0;
		}
	}
	

	public void removeVehiclesByType(String type) {
		for (int i = 0; i < this.garageStorage.size(); i++) {
			if (this.garageStorage.get(i).getType() == type) {
				this.removeVehicle(this.garageStorage.get(i));
				i--;
			}
		}
	}

	
	public List checkPriceForRepairs() {
		int carPrice = 100;
		int jetPrice = 10000;
		int motorbikePrice = 150;
		List<List> fixList = new ArrayList<>();

		for (Vehicle vehicle : this.garageStorage) {
			if (vehicle.getType() == "Car") {
				List<String> car = new ArrayList<>();
				car.add("Car ID: " + vehicle.getId() + ": Cost of repairs are: £" + carPrice);
				fixList.add(car);
			} else if (vehicle.getType() == "Plane") {
				List<String> plane = new ArrayList<>();
				plane.add("Plane ID: " + vehicle.getId() + ": Cost of repairs are: £" + jetPrice);
				fixList.add(plane);
			} else if (vehicle.getType() == "Motorbike") {
				List<String> motorbike = new ArrayList<>();
				motorbike.add("Motorbike ID: " + vehicle.getId() + ": Cost of repairs are: £" + motorbikePrice);
				fixList.add(motorbike);
			} else {
				break;
			}
		}
		return fixList;
	}

	
	public void printGarage() {
		System.out.println(this.garageStorage);
	}
}

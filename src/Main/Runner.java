package Main;
import com.qa.Garage.Garage;
import com.qa.vehicle.Car;
import com.qa.vehicle.Motorbikes;
import com.qa.vehicle.PrivateJet;

public class Runner {

	public static void main(String[] args) {
		Car newCar = new Car(1, null, "Mercedes", "E-Class", 12000, 
				false, false, 4, 20);
		Car newCar2 = new Car(4, null, "BMW", "5-Series", 10000, 
				false, false, 5, 18);
		PrivateJet newJet = new PrivateJet(2, null, "Gulfstream", "G650", 6000000, 
				false, true, 12, "Captain Jehad", "Liz");
		Motorbikes newBike = new Motorbikes(3, null, "Suzuki", "R60", 8000, 
				false, false, 2, false);
		
		Garage myGarage = new Garage();
		
		myGarage.addVehicle(newCar);
		myGarage.removeVehicle(newCar);
		
		myGarage.addVehicle(newCar);
		myGarage.addVehicle(newJet);
		myGarage.addVehicle(newCar2);
		myGarage.addVehicle(newBike);
		
		myGarage.removeVehiclesByType("Car");
		
		myGarage.addVehicle(newCar);
		myGarage.addVehicle(newCar2);
		
		myGarage.printGarage();
		
		System.out.println(myGarage.checkPriceForRepairs());
		
		System.out.println(myGarage.checkPriceForfix("Motorbike"));
		
		System.out.println(myGarage.checkAndFix(newJet));
		}
}

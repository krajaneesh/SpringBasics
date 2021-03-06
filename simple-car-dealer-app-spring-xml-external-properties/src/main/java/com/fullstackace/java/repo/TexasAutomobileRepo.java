package com.fullstackace.java.repo;

import java.util.ArrayList;
import java.util.List;

import com.fullstackace.java.model.Car;
import com.fullstackace.java.model.Truck;

public class TexasAutomobileRepo implements AutomobileRepo {

	private String userName;
	
	@Override
	public List<Car> findCars() {

		List<Car> autos = new ArrayList<>();

		// Assuming DB/Repository connection to get vehicles.
		Car car1 = new Car("11103", 2018, "Subaru Impreza", 5, 2.8f, 8, 28, true, 27000);
		Car car2 = new Car("11101", 2017, "Chevy Camaro", 4, 5.2f, 3.2f, 18, false, 31000);
		Car car3 = new Car("11102", 2018, "Ford Mustang", 4, 4.5f, 3.5f, 24, false, 28500);

		autos.add(car1);
		autos.add(car2);
		autos.add(car3);

		return autos;
	}

	@Override
	public List<Truck> findTrucks() {

		List<Truck> autos = new ArrayList<>();

		// Assuming DB/Repository connection to get vehicles.

		Truck truck1 = new Truck("21002", 2018, "Ford F150", 5, 4, 7.2f, 20000, 19, true, 32000);
		Truck truck2 = new Truck("21001", 2018, "Dodge Ram", 5, 6.2f, 4.5f, 35000, 15, true, 39000);

		autos.add(truck1);
		autos.add(truck2);

		return autos;

	}

	public void setUserName(String userName) {
		System.out.println("Setting userName from external file : "+userName);
		this.userName = userName;
	}

	
}

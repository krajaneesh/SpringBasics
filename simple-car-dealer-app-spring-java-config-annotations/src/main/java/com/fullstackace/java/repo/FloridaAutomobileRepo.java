package com.fullstackace.java.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fullstackace.java.model.Car;
import com.fullstackace.java.model.Truck;

@Repository("repo") // this repo is injected, because we have two AutomobileRepo types and this is the setter parameter or member name in Service which is being autowired.
public class FloridaAutomobileRepo implements AutomobileRepo {
	public List<Car> findCars() {

		List<Car> autos = new ArrayList<Car>();

		// Assuming DB/Repository connection to get vehicles.
		Car car1 = new Car("11110", 2018, "Honda Accord", 5, 2.8f, 8, 28, false, 27000);
		Car car2 = new Car("11111", 2017, "Dodge Charger", 4, 5.2f, 3.2f, 18, false, 31000);
		Car car3 = new Car("11112", 2018, "Toyota Camry", 4, 2.5f, 9, 31, false, 28500);

		autos.add(car1);
		autos.add(car2);
		autos.add(car3);

		return autos;
	}

	public List<Truck> findTrucks() {

		List<Truck> autos = new ArrayList<Truck>();

		// Assuming DB/Repository connection to get vehicles.

		Truck truck1 = new Truck("21100", 2018, "Ford Raptor", 4, 7, 3.8f, 37000, 17, true, 35000);
		Truck truck2 = new Truck("21101", 2018, "Chevy Silverado", 5, 6.2f, 4.5f, 35000, 15, true, 39000);

		autos.add(truck1);
		autos.add(truck2);

		return autos;

	}
}

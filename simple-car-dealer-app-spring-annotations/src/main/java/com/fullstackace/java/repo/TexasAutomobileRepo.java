package com.fullstackace.java.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fullstackace.java.model.Car;
import com.fullstackace.java.model.Truck;

//Repository name need not match the Repository name declared in Service, if this is the only Bean of type AutomobileRepo. 
//Now that we have two beans of type AutomobileRepo, annotated name must match the Repo reference in Service, else Spring complains, if found more than one beans of type AutomobileRepo 
@Repository("repo") 
public class TexasAutomobileRepo implements AutomobileRepo{

	public List<Car> findCars(){
		
		List<Car> autos = new ArrayList<Car>();
		
		// Assuming DB/Repository connection to get vehicles.
		Car car1 = new Car("11103", 2018, "Subaru Impreza", 5, 2.8f, 8, 28, true, 27000);
		Car car2 = new Car("11101", 2017, "Chevy Camaro", 4, 5.2f, 3.2f, 18, false, 31000);
		Car car3 = new Car("11102", 2018, "Ford Mustang", 4, 4.5f, 3.5f, 24, false, 28500);
		
		
		autos.add(car1);
		autos.add(car2);
		autos.add(car3);
		
		return autos;
	}
	
	public List<Truck> findTrucks(){
		
		List<Truck> autos = new ArrayList<Truck>();
		
		//Assuming DB/Repository connection to get vehicles.
		
		Truck truck1 = new Truck("21002", 2018, "Ford F150", 5, 4, 7.2f, 20000, 19, true, 32000);
		Truck truck2 = new Truck("21001", 2018, "Dodge Ram", 5, 6.2f, 4.5f, 35000, 15, true, 39000);
		
		autos.add(truck1);
		autos.add(truck2);
		
		return autos;
		
	}
	
}

package com.fullstackace.java.repo;

import java.util.List;

import com.fullstackace.java.model.Car;
import com.fullstackace.java.model.Truck;

public interface AutomobileRepo {

	List<Car> findCars();
	List<Truck> findTrucks();

}
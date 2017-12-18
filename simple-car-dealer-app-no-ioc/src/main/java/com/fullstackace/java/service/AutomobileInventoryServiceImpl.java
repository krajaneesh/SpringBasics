package com.fullstackace.java.service;

import java.util.ArrayList;
import java.util.List;

import com.fullstackace.java.model.Automobile;
import com.fullstackace.java.model.Car;
import com.fullstackace.java.model.Truck;
import com.fullstackace.java.repo.AutomobileRepo;
import com.fullstackace.java.repo.TexasAutomobileRepo;

public class AutomobileInventoryServiceImpl implements AutomobileInventoryService {

	//TODO use Spring Container to inject TexasAutomobileRepo
	AutomobileRepo repo = new TexasAutomobileRepo();

	public List<Automobile> findRacingVehicles() {
		List<Automobile> racingVehicles = new ArrayList<Automobile>();

		List<Car> cars = repo.findCars();
		for (Car car : cars) {
			if ((car.getCapacityILitres() > 4) && (car.getZeroToSixtyInSeconds() < 5)) {
				racingVehicles.add(car);
			}
		}

		List<Truck> trucks = repo.findTrucks();
		for (Truck truck : trucks) {
			if ((truck.getCapacityILitres() > 6) && (truck.getZeroToSixtyInSeconds() < 6)) {
				racingVehicles.add(truck);
			}
		}

		return racingVehicles;
	}

	public List<Automobile> findFamilyVehicles() {
		List<Automobile> familyVehicles = new ArrayList<Automobile>();

		List<Car> cars = repo.findCars();
		for (Car car : cars) {
			if ((car.getNumberOfSeats() >= 4) && (car.getFuelEconomyInMpg() > 20)) {
				familyVehicles.add(car);
			}
		}

		List<Truck> trucks = repo.findTrucks();
		for (Truck truck : trucks) {
			if ((truck.getNumberOfSeats() >= 4) && (truck.getFuelEconomyInMpg() > 15)) {
				familyVehicles.add(truck);
			}
		}

		return familyVehicles;
	}

	public List<Automobile> findOffRoadVehicles() {
		List<Automobile> offRoadVehicles = new ArrayList<Automobile>();

		List<Car> cars = repo.findCars();
		for (Car car : cars) {
			if (car.isFourWheelDrive() && (car.getCapacityILitres()>4)) {
				offRoadVehicles.add(car);
			}
		}

		List<Truck> trucks = repo.findTrucks();
		for (Truck truck : trucks) {
			if (truck.isFourWheelDrive() && (truck.getTowingCapacityInPounds() > 20000)) {
				offRoadVehicles.add(truck);
			}
		}

		return offRoadVehicles;
	}

}

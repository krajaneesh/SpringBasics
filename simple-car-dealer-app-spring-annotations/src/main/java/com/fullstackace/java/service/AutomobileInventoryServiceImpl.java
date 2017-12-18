package com.fullstackace.java.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstackace.java.model.Automobile;
import com.fullstackace.java.model.Car;
import com.fullstackace.java.model.Truck;
import com.fullstackace.java.repo.AutomobileRepo;

@Service("autoInventorySrvc")
public class AutomobileInventoryServiceImpl implements AutomobileInventoryService {

	// @Autowired // No setter required.
	private AutomobileRepo repo;

	@Autowired // the parameter name repo should exatly match the Annotated name of repo or that Repo should be the only bean of that (AutomobileRepo) type that Spring sees.
	public AutomobileInventoryServiceImpl(AutomobileRepo repo) {
		super();
		System.out.println("Constructor injection in working!");
		this.repo = repo;
	}

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
			if (car.isFourWheelDrive() && (car.getCapacityILitres() > 4)) {
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

	@Autowired
	public void setRepo(AutomobileRepo repo) {
		System.out.println("Setter injection in working!");
		this.repo = repo;
	}

	// @Autowired // Will not work because none of the two repos are stereotype
	// annotated with name repository & Spring sees two beans of type AutomobileRepo
	// public void setRepo(AutomobileRepo repository) {
	// System.out.println("Setter injection in working!");
	// this.repo = repository;
	// }
}

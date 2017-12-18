package com.fullstackace.java.service;

import java.util.List;

import com.fullstackace.java.model.Automobile;

public interface AutomobileInventoryService {
	List<Automobile> findRacingVehicles();
	List<Automobile> findFamilyVehicles();
	List<Automobile> findOffRoadVehicles();
}

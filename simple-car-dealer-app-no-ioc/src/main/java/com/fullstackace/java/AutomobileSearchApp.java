package com.fullstackace.java;

import com.fullstackace.java.service.AutomobileInventoryService;
import com.fullstackace.java.service.AutomobileInventoryServiceImpl;

public class AutomobileSearchApp {

	public static void main(String[] args) {
		
		//TODO use Spring Container to inject AutomobileInventoryServiceImpl
		AutomobileInventoryService automobileInventory = new AutomobileInventoryServiceImpl();
		
		System.out.println("Available Family vehicles"+automobileInventory.findFamilyVehicles());
		System.out.println("Available Racing vehicles"+automobileInventory.findRacingVehicles());
		System.out.println("Available Off-Road vehicles"+automobileInventory.findOffRoadVehicles());
	}

}

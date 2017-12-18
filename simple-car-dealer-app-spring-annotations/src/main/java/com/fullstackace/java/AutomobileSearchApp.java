package com.fullstackace.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullstackace.java.service.AutomobileInventoryService;

public class AutomobileSearchApp {

	private static AutomobileInventoryService automobileInventory;

	public static void main(String[] args) {

		//try-with-resources statement for ResourceLoaders that implement AutoCloseable - available since java 1.7 or 1.8
		try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appConfig.xml")) {
			automobileInventory = appContext.getBean("autoInventorySrvc", AutomobileInventoryService.class);
		}

		System.out.println("Available Family vehicles" + automobileInventory.findFamilyVehicles());
		System.out.println("Available Racing vehicles" + automobileInventory.findRacingVehicles());
		System.out.println("Available Off-Road vehicles" + automobileInventory.findOffRoadVehicles());
	}

}

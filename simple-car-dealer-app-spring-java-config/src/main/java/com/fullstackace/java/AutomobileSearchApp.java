package com.fullstackace.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fullstackace.java.service.AutomobileInventoryService;

public class AutomobileSearchApp {

	public static void main(String[] args) {

		AutomobileInventoryService automobileInventory = null;

		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
			automobileInventory = appContext.getBean("inventoryService", AutomobileInventoryService.class);
		}

		System.out.println("Available Family vehicles" + automobileInventory.findFamilyVehicles());
		System.out.println("Available Racing vehicles" + automobileInventory.findRacingVehicles());
		System.out.println("Available Off-Road vehicles" + automobileInventory.findOffRoadVehicles());
	}

}

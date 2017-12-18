package com.fullstackace.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fullstackace.java.service.AutomobileInventoryService;
import com.fullstackace.java.service.AutomobileInventoryServiceImpl;

public class AutomobileSearchApp {

	public static void main(String[] args) {
		
		//Getting Spring Bean Context based of an xml file in classpath
		ApplicationContext springBeanContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Getting the Service Ref based of bean name from Application context
		AutomobileInventoryService automobileInventory = springBeanContext.getBean("autoInventorySrvc", AutomobileInventoryService.class);
		
		System.out.println("Available Family vehicles"+automobileInventory.findFamilyVehicles());
		System.out.println("Available Racing vehicles"+automobileInventory.findRacingVehicles());
		System.out.println("Available Off-Road vehicles"+automobileInventory.findOffRoadVehicles());
	}

}

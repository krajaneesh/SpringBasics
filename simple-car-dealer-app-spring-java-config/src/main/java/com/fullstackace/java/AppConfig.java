package com.fullstackace.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fullstackace.java.repo.AutomobileRepo;
import com.fullstackace.java.repo.TexasAutomobileRepo;
import com.fullstackace.java.service.AutomobileInventoryService;
import com.fullstackace.java.service.AutomobileInventoryServiceImpl;

@Configuration
public class AppConfig {

	@Bean("autoRepo")
	public AutomobileRepo getMeAutoRepo() {
		return new TexasAutomobileRepo();
	}
	
	@Bean("inventoryService")
	public AutomobileInventoryService someMethodName() {
		AutomobileInventoryServiceImpl inventoryService = new AutomobileInventoryServiceImpl();
		//constructor injection can be done similar to the setter injection below.
		inventoryService.setRepo(getMeAutoRepo()); // It might appear that Spring isn't doing much here. But, Spring makes autoRepo a Singleton. It does not create a new instance of repo when a cached instance exists in the app context.
		return inventoryService;
	}
	
}

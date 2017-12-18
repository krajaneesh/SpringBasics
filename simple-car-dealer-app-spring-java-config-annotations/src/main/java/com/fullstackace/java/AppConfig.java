package com.fullstackace.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.fullstackace.java"}) // Array of Strings with package names under which Spring should scan for annotated beans.
public class AppConfig {

	// We are using Annotations in Service and Repo for Autowiring. 
	// Nothing else is required in Config class except the @Configuration & @ComponentScan with base package under which Spring scans for annotated beans.
	
}

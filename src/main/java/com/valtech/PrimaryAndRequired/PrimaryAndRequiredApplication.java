package com.valtech.PrimaryAndRequired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.valtech.PrimaryAndRequired")
public class PrimaryAndRequiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimaryAndRequiredApplication.class, args);
	}
}

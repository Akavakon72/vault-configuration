package com.ashutosh.vaultconfiguration;

import com.ashutosh.vaultconfiguration.configuration.MyConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
public class VaultConfigurationApplication implements CommandLineRunner {

	Logger log = LoggerFactory.getLogger(VaultConfigurationApplication.class);

	private final MyConfiguration myConfiguration;

	public VaultConfigurationApplication(MyConfiguration myConfiguration) {
		this.myConfiguration = myConfiguration;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VaultConfigurationApplication.class, args);
		
		MyConfiguration myConfiguration = context.getBean(MyConfiguration.class);
		System.out.println("Login: " + myConfiguration.getUsername());
		System.out.println("Password: " + myConfiguration.getPassword());
	}

	
	@Override
	public void run(String... args) throws Exception {
		log.info("Myconfiguration username: " + myConfiguration.getUsername());
		log.info("MyConfiguration password: " + myConfiguration.getPassword());
		
	}

}
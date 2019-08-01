package com.magfine.mockserver;

import com.magfine.mockserver.initial.ApplicationStartup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MockserverApplication {

	public static void main(String[] args) {
		SpringApplication springApplication =new SpringApplication(MockserverApplication.class);
		springApplication.addListeners( new ApplicationStartup() );
		springApplication.run( args );
	}

}

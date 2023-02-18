package com.cheesybaby.lrnr2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Lrnr2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lrnr2Application.class, args);
	}

}

package com.web.cricket;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
public class CricketTeamInfoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CricketTeamInfoApplication.class, args);
	}

}

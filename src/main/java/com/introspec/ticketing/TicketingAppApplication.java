package com.introspec.ticketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TicketingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingAppApplication.class, args);
	}
}

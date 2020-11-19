package com.springdemoAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemoAnnotations")
public class SuperConfig {
	
	@Bean
	public SuperFortune superFortune() {
		return new SuperFortune();
	}
	
	@Bean
	public MySuperCoach mySuperCoach() {
		return new MySuperCoach(superFortune());
	}

}

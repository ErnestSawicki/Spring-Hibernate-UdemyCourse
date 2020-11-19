package com.springdemoAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.springdemoAnnotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService mediumFortuneService() {
		return new MediumFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(mediumFortuneService());
		return mySwimCoach;
	}

}

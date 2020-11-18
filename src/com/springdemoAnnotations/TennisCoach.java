package com.springdemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	

	private FortuneService fortuneService;
	
	
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	/*
	@Autowired 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: doSomeCrazyStuff...");
		this.fortuneService = fortuneService; 
	}
	*/
	
	 

	@Override
	public String getDailyWorkout() {
		return "Hit this ball ! Run 10 miles ! Practice backhand volley !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

package com.springdemoAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	

	private FortuneService fortuneService;
	
	
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct 
	public void doSomeStuf() {
		System.out.println("Here we can do crazy stuff! As an init method");
	}
	
	@PreDestroy
	public void cleanUpBeforeDestroy() {
		System.out.println("I am dying!");
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

package com.springdemoAnnotations;

import com.springdemo.Coach;

public class MySuperCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public MySuperCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		return "Superb job - home work done and works";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

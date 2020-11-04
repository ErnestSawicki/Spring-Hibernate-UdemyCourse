package com.springdemo;

public class JavaCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public JavaCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "WriteMoreCodeYouLazyBastard";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

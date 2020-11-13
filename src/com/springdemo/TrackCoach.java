package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {};
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//init method
	public void startupStuff() {
		System.out.println("TrackCoach: inside method startupStuff");
	}
	
	
	//destroy method
	public void cleanupStuff() {
		System.out.println("TrackCoach: inside method cleanupStuff");
	}
}

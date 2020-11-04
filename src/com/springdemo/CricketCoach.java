package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	

	@Override
	public String getDailyWorkout() {
		return "Something doing cricket!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "This day on cricket: " + fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}

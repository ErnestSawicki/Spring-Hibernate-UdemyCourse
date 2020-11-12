package com.springdemo;

public class SpringCoach implements Coach {
	
	private String dailyWorkout;
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setDailyWorkout(String dailyWorkout) {
		this.dailyWorkout = dailyWorkout;
	}
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return dailyWorkout;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getTeam() {
		return team;
	}
	
	@Override
	public String toString() {
		return "DailyWorkout: "+ this.getDailyWorkout() + ", "
	+  "DailyFortune: " + this.getDailyFortune()+ ", \n"
	+ "email: " + this.getEmailAddress() + ", "
	+ "team: " + this.getTeam();
	}

}

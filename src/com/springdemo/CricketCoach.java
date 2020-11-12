package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	

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
	
	public void setEmailAddress(String email) {
		this.emailAddress = email;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
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

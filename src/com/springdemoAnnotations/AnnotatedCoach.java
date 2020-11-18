package com.springdemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedCoach implements Coach {
	
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	

	@Override
	public String getDailyWorkout() {
		return "When you practice Spring you will understand it all !";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}

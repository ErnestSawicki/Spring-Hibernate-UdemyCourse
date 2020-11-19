package com.springdemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextCoach implements Coach {
	
	@Autowired
	@Qualifier("textFortunes")
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "I read this text today! File should work";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

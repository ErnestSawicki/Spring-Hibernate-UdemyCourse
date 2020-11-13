package com.springdemoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class AnnotatedCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "When you practice Spring you will understand it all !";
	}

}

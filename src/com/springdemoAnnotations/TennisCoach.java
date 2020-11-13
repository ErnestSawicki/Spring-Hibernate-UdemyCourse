package com.springdemoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Hit this ball ! Run 10 miles ! Practice backhand volley !";
	}

}

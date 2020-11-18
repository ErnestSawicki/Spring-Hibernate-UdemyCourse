package com.springdemoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Its a sadDay - you failed!";
	}

}

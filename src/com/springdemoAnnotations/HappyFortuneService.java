package com.springdemoAnnotations;

import org.springframework.stereotype.Component;

import com.springdemo.Coach;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is you luckyDay";
	}

	

}

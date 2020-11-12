package com.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	
	private String[] randomFortunes = new String[] {
			"Today is your luckyDay",
			"Today is your normalDay",
			"Today is your badDay - but dont give up !"
	};

	@Override
	public String getFortune() {
		return randomFortunes[new Random().nextInt(3)];
	}

}

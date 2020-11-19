package com.springdemoAnnotations;

public class SuperFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "This is your SUPER fortune - annotations done!";
	}

}

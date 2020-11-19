package com.springdemoAnnotations;

public class MediumFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return ">>MediumFortuneService: Its normal day";
	}

}

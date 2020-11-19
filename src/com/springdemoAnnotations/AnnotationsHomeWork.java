package com.springdemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsHomeWork {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

		Coach textCoach = context.getBean("textCoach", Coach.class);
		
		
		System.out.println("TextCoach: dailyFortune is " + textCoach.getDailyFortune());
		System.out.println("TextCoach: dailyWorkout is " + textCoach.getDailyWorkout());
	
		context.close();
	}

}

package com.springdemoAnnotations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class TextFortunes implements FortuneService {
	
	private ArrayList<String> fortunes = new ArrayList<>();
	
	@PostConstruct
	private void loadFortunesFromTxt() {

		try {
			File myFortunes = new File("C://Users/dell/Desktop/Coding/eclipse-workspace/udemyCourseSpring-spring-demo-one/src/textFiles/myFortunes.txt");
			Scanner myReader = new Scanner(myFortunes);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(">>TextFortunes: readData=" + data);
				fortunes.add(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(">>TextFortunes: An error occured while loading data");
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		return fortunes.get(new Random().nextInt(fortunes.size()));
	}

}

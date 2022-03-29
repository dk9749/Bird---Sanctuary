package com.bridgelabz;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.Bird.Category;
import com.bridgelabz.Bird.Color;
import com.bridgelabz.Bird.Gender;

//View Layer
public class UserInterface {
	private static UserInterface userInterface;

	private UserInterface() {
	}

	public static synchronized UserInterface getInstance() {
		if (userInterface == null) {
			userInterface = new UserInterface();
		}
		return userInterface;
	}

	public void addBird() {
		Bird bird = new Bird();
		bird.name = UtilScanner.getString("Enter Bird Name: ");
		bird.id = UtilScanner.getString("Enter Bird Id: ");
		setColor(bird);
		setGender(bird);
		setCategory(bird);

		BirdRepository birdRepository = BirdRepository.getInstance();
		birdRepository.add(bird);
	}

	private void setCategory(Bird bird) {
		int choice = UtilScanner.getInt("Enter Bird Category:\n1 to Flyable\n2 to Swimable");
		switch (choice) {
		case 1:
			bird.category = Category.FLYABLE;
			break;
		case 2:
			bird.category = Category.SWIMABLE;
			break;
		}
	}

	private void setGender(Bird bird) {
		int choice = UtilScanner.getInt("Enter Bird Gender:\n1 to Male\n2 to Female");
		switch (choice) {
		case 1:
			bird.gender = Gender.MALE;
			break;
		case 2:
			bird.gender = Gender.FEMALE;
			break;
		}
	}

	private void setColor(Bird bird) {
		int choice = UtilScanner
				.getInt("Enter Bird Color:\n1 to Black\n2 to White" + "\n3 to Black & White\n4 to Green\n5 to Gray");
		switch (choice) {
		case 1:
			bird.color = Color.BLACK;
			break;
		case 2:
			bird.color = Color.WHITE;
			break;
		case 3:
			bird.color = Color.BlACK_AND_WHITE;
			break;
		case 4:
			bird.color = Color.GREEN;
			break;
		case 5:
			bird.color = Color.GRAY;
			break;
		}
	}

	public void updateBird() {
		BirdRepository birdRepository = BirdRepository.getInstance();
		Bird b = birdRepository.getBird(UtilScanner.getString("Enter Old Name To Update: "));
		boolean flag = false;
		while (!flag) {
			int choice = UtilScanner.getInt(
					"Press for Update:\n1 to Name\n" + "2 to Id\n3 to Color\n4 to Gender\n5 to Category\n6 to Exit");
			switch (choice) {
			case 1:
				b.name = UtilScanner.getString("Enter New Name: ");
				break;
			case 2:
				b.id = UtilScanner.getString("Enter New Id: ");
				break;
			case 3:
				setColor(b);
				break;
			case 4:
				setGender(b);
				break;
			case 5:
				setCategory(b);
				break;
			case 6:
				System.out.println("Exit !!");
				flag = true;
			}
		}
	}
}

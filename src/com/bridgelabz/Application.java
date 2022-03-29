package com.bridgelabz;

// Control Layer
public class Application {
	public static void main(String[] args) {
		controller();
	}

	public static void controller() {
		BirdRepository birdRepository = BirdRepository.getInstance();
		UserInterface userInterface = UserInterface.getInstance();
		System.out.println("WECOME TO BIRD SANCTUARY PROGRAM");
		boolean flag = false;
		while (!flag) {
			int choice = UtilScanner
					.getInt("\nPlease Enter:- \n1 to Add\n2 to Remove\n3 to Update\n4 to Print\n5 to Exit");
			switch (choice) {
			case 1:
				userInterface.addBird();
				break;
			case 2:
				String searchBird = UtilScanner.getString("Enter Bird Name to Remove: ");
				Bird foundBird = birdRepository.getBird(searchBird);
				birdRepository.remove(foundBird);
				break;
			case 3:
				userInterface.updateBird();
				break;
			case 4:
				birdRepository.printAllBird();
				break;
			case 5:
				System.out.println("Exit !!");
				flag = true;
				break;
			}
		}
	}
}

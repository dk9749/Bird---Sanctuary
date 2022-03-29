package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Data Layer / Model Layer
public class BirdRepository {

	private static BirdRepository birdRepository;

	private BirdRepository() {
	}

	public static synchronized BirdRepository getInstance() {
		if (birdRepository == null) {
			birdRepository = new BirdRepository();
		}
		return birdRepository;
	}

	List<Bird> birdlist = new ArrayList<>();
//	Set<Bird> birdlist = new HashSet<>();

	public void add(Bird bird) {
		birdlist.add(bird);
	}

	public void remove(Bird bird) {
		birdlist.remove(bird);
	}

	public void printAllBird() {
		for (Bird b : birdlist) {
			System.out.println(b);
		}
	}

	public Bird getBird(String searchBird) {
		for (Bird b : birdlist) {
			if (b.name.equalsIgnoreCase(searchBird)) {
				return b;
			}
		}
		return null;
	}
}

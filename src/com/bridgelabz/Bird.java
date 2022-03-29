package com.bridgelabz;

import java.util.Objects;

//Generalization
public class Bird {
	enum Gender {
		MALE, FEMALE
	};

	enum Color {
		WHITE, BLACK, GREEN, BlACK_AND_WHITE, GRAY
	};

	enum Category {
		FLYABLE, SWIMABLE
	};

	String name;
	String id;
	Gender gender;
	Color color;
	Category category;

	@Override
	public String toString() {
		return "Bird [name=" + name + ", id=" + id + ", gender=" + gender + ", color=" + color + ", category="
				+ category + "]";
	}
}

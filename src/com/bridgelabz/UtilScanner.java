package com.bridgelabz;

import java.util.Scanner;

public class UtilScanner {

	private static final Scanner SCANNER = new Scanner(System.in);

	public static int getInt(String message) {
		message(message);
		return SCANNER.nextInt();
	}

	public static double getDouble(String message) {
		message(message);
		return SCANNER.nextDouble();
	}

	public static boolean getBoolean(String message) {
		message(message);
		return SCANNER.nextBoolean();
	}

	public static String getString(String message) {
		message(message);
		return SCANNER.next();
	}

	private static void message(String msg) {
		System.out.println(msg);
	}
}

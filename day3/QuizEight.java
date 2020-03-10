package com.capgemini.quiz.day3;

public class QuizEight {

	public static void printValue(int i, int j, int k) {
		System.out.println("int");
	}

	public static void printValue(byte... b) {
		System.out.println("long");
	}

	public static void main(String... args) {
		byte b = 9;
		printValue(b, b, b);
	}
}

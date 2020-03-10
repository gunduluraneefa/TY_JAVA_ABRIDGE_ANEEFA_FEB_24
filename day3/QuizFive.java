package com.capgemini.quiz.day3;

public class QuizFive {
	public QuizFive() {
	
		System.out.println("quiz five");
	}

	public  QuizFive(int i) {
		this(); // call to this
		System.out.println(i);
	}

}
class Base extends QuizFour {
	public Base() {
		System.out.println("b");
	}

	public Base(int i) {
		this();
		System.out.println(i + 3);
	}
}

class Sample {
	public static void main(String[] args) {
		new Base(5);

	}
}

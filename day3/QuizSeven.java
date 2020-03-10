package com.capgemini.quiz.day3;

public class QuizSeven {

	private void printName() {
		System.out.println("Value-A");
	}
}

class B extends QuizSeven {
	public void printName() {
		System.out.println("Name-B");
	}
}

 class King {
	public static void main(String[] args) {
		B b = new B();
		b.printName();
	}
}

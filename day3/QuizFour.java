package com.capgemini.quiz.day3;

public class QuizFour { // **constructor overriding
	int value = 0;

	public  void QuizFour1() {
		addValue();
	}

	void addValue() {
		value += 10;
	}

	int getValue() {
		return value;
	}
}

class Derived extends QuizFour {
	Derived() {
		addValue();
	}

	void addValue() {
		value += 20;
	}
}

class TestD {
	public static void main(String[] args) {
		QuizFour q = new Derived();
		System.out.println(q.getValue());

	}

}

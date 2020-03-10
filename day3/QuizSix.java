package com.capgemini.quiz.day3;

public class QuizSix {

	static void method() {
		System.out.println("Class A method");
	}
}

class G extends QuizSix {
	static void method() {
		System.out.println("Class B method");
	}
}

 class TestZ {
	public static void main(String args[]) {
		QuizSix a = new G();
		QuizSix.method();
	}
}

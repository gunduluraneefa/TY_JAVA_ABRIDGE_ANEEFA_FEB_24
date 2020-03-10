package com.capgemini.quiz.day6;

public interface QuizOne {

	void print();
}

interface Showable {
	void print();
}

class TestInterface3 implements QuizOne, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		TestInterface3 obj = new TestInterface3();
		obj.print();
	}
}
// output=hello
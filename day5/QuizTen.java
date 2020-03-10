package com.capgemini.quiz.day5;

interface QuizTen {

	void print();
}

interface Showable {
	void show();
}

class A7 implements QuizTen, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		A7 obj = new A7();
		obj.print();
		obj.show();
	}
}

// Output:Hello
// note:quizten=printable

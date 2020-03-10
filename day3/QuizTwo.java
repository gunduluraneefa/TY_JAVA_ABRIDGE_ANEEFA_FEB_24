package com.capgemini.quiz.day3;

public class QuizTwo {
	public QuizTwo() {
		// TODO Auto-generated constructor stub
	}

	void eat() { // this eat() is not constructor ,it is a method(we can't use call to this or
					// call to super in method))
		// this();//call to this is first statement in constructor
		System.out.println("eating");
	}
}

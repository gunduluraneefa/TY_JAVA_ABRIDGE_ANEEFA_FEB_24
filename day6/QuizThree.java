package com.capgemini.quiz.day6;// Default Method in Interface

public interface QuizThree {

	void draw();

	default void msg() {
		System.out.println("default method");
	}
}

class Rectangle implements QuizThree {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		QuizThree d = new Rectangle();
		d.draw();
		d.msg();
	}
}
/*
 * drawing rectangle default method
 */
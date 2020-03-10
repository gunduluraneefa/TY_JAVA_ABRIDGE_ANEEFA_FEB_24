package com.capgemini.quiz.day6;//Example of method overriding

public class QuizTen {
	// Java Program to illustrate the use of Java Method Overriding
	// Creating a parent class.

	// defining a method
	void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike2 extends QuizTen {
	// defining the same method as in the parent class
	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String args[]) {
		Bike2 obj = new Bike2();// creating object
		obj.run();// calling method
	}
}
/*
 * Output: Bike is running safely
 */

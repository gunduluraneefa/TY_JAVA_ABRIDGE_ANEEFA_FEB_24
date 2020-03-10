package com.capgemini.quiz.day6;//Understanding the problem without method overriding

public class QuizNine {
	// Java Program to demonstrate why we need method overriding
	// Here, we are calling the method of parent class with child
	// class object.
	// Creating a parent class

	void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike extends QuizNine {
	public static void main(String args[]) {
		// creating an instance of child class
		Bike obj = new Bike();
		// calling the method with child class instance
		obj.run();
	}
}
/*
 * output Vehicle is running. Problem is that I have to provide a specific
 * implementation of run() method in subclass that is why we use method
 * overriding
 */

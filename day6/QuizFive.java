package com.capgemini.quiz.day6;//Single Inheritance Example

public class QuizFive {

	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends QuizFive {
	void bark() {
		System.out.println("barking...");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}
/*output
 * barking... eating...
 */
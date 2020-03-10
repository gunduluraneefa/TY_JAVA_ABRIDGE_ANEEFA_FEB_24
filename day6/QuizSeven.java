package com.capgemini.quiz.day6;//Hierarchical Inheritance Example

public class QuizSeven {

	void eat() {
		System.out.println("eating...");
	}
}

class Dg extends QuizSeven {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends QuizSeven {
	void meow() {
		System.out.println("meowing...");
	}
}

class TestInheritance3 {
	public static void main(String args[]) {
		Cat c = new Cat();
		c.meow();
		c.eat();
		// c.bark();//C.T.Error
	}
}

/*
 * output meowing... eating...
 */
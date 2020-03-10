package com.capgemini.quiz.day5;

public interface QuizEight {
	// Interface declaration: by first user

	void draw();
}

// Implementation: by second user
class Rectang implements QuizEight {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle implements QuizEight {
	public void draw() {
		System.out.println("drawing circle");
	}
}

// Using interface: by third user
class TestInterface1 {
	public static void main(String args[]) {
		QuizEight d = new Circle();// In real scenario, object is provided by method e.g. getDrawable()
		d.draw();
	}
}
// answer=drawing rectangle
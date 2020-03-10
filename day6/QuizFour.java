package com.capgemini.quiz.day6;
//Static Method in Interface
public interface QuizFour {

	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class Rect implements QuizFour {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceStatic {
	public static void main(String args[]) {
		QuizFour d = new Rect();
		d.draw();
		System.out.println(QuizFour.cube(3));
	}
}
//drawing rectangle
//27
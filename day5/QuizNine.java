package com.capgemini.quiz.day5;

public interface QuizNine {

	float rateOfInterest();
}

class Sbi implements QuizNine {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class Pnb implements QuizNine {
	public float rateOfInterest() {
		return 9.7f;
	}
}

class TestInterface2 {
	public static void main(String[] args) {
		QuizNine b = new Sbi();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
// note:QuizNine=bank
// answer=9.15

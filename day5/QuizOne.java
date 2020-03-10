package com.capgemini.quiz.day5;

import com.capgemini.quiz.day4.QuizTwo;

public class QuizOne extends QuizTwo { // PROTECTED ACCESS MODIFIER
	// Quiztwo is from day4 package
	// quizone is from day5 package
	public static void main(String[] args) {
		QuizOne QuizTwo = new QuizOne();
		// invokes debug() from quiztwo class which is in another day4 package is
		// protected
		// this protcted debugbug() is accessed in the quizone of day5 package
		// this access is possible becoz quizone of day5 inherits quiztwo of day4
		QuizTwo.debug("hello from quiztwo");
	}
}

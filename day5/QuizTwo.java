package com.capgemini.quiz.day5;

import com.capgemini.quiz.day4.QuizThree;
// continuation of day4 package class two
public class QuizTwo { 
// public access modifier
		public static void main(String[] args) {
			// object creation of quizthree of package day4
			QuizThree QuizThree = new QuizThree();
			QuizThree.debug("debug with level" + QuizThree.debugLevel);
			QuizThree.debugLevel = 5;
			// able initiate quizthree day4 package variable becoz it is declared as public and
			// the variables and methods inside quiztwo of day 5 package is also public
			// hence able to use directly in quiztwo day5 package
			QuizThree.info(" info with level is" + QuizThree.debugLevel);
		}
	}


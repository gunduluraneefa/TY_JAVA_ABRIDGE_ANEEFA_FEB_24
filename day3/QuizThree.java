package com.capgemini.quiz.day3;

public class QuizThree { //* method overriding*//
	void talk() { // parent class methodname talk()
		System.out.println("i am old");
	}
}

class Son extends QuizThree { // child class extending parent class
	void talk() { // child class method name same as parent class becoz overriding
		System.out.println("i am younge"); // changing implementation of parent method i.e sop
	}
}

class Test {
	public static void main(String[] args) {
		QuizThree q = new Son(); // here for childclass(son) object is created [new son();]----means sonclass
									// object is created
		q.talk(); // p holds sonclass talk() method datai.e (i am young)
	}
}

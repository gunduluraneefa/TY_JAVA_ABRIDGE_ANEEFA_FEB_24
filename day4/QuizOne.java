package com.capgemini.quiz.day4;

public class QuizOne {  //PRIVATE ACCESS MODIFIERS//
	private String name;    // here,name is a private variable

	public String getName() {
		return this.name;

	}

	public void setName(String name) {
		this.name = name;
	}
}

class Main {
	public static void main(String[] args) {
		QuizOne d = new QuizOne();
		d.setName("programiz");
		System.out.println(d.getName()); // name is accessed in another class main by the help
		                                   //  of public getter and setter methods
	}
}

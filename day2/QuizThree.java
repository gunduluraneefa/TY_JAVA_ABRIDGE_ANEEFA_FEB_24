package com.capgeemini.quiz.day2;

public class QuizThree {
public static void main(String[] args) {
	for(int i=0;i<3;i++) {
		for(int j=1;j<4;j++) {
			i%=j;
			System.out.println(j);// infinite loop
		}
	}
}
}

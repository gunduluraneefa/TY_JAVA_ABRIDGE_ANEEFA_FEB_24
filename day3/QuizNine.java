package com.capgemini.quiz.day3;

public class QuizNine {
	
	      public void printValue(){
	            System.out.println("Value-A");
	      }
	}
	class J extends QuizNine {
	      public void printNameB(){
	            System.out.println("Name-B");
	      }
	}
	class C extends QuizNine{
	      public void printNameC(){
	            System.out.println("Name-C");
	      }
	}

	 class Sampu{
	       public static void main (String[] args){
	             J b = new J();
	             C c = new C();
	             newPrint(b);
	             newPrint(c);
	       }
	       public static void newPrint(QuizNine  a){
	             a.printValue();
	      }
	 }


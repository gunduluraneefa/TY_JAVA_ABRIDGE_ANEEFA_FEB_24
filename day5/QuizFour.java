package com.capgemini.quiz.day5;

abstract class QuizFour {
	
		  abstract void run();  
		}  
		class Honda4 extends  QuizFour{  
		void run(){
			System.out.println("running safely");
		}  
		public static void main(String args[]){  
			 QuizFour obj = new Honda4();  
		 obj.run();  
		}  
		}  


package com.capgemini.quiz.day5;


	abstract class QuizFive{
		abstract void draw();
		}
		//In real scenario, implementation is provided by others i.e. unknown by end user
		class Rectangle extends QuizFive{
		void draw(){System.out.println("drawing rectangle");}
		}

		class Circle1 extends QuizFive{
		void draw(){System.out.println("drawing circle");}
		}

		//In real scenario, method is called by programmer or user
		class TestAbstraction1{
		public static void main(String args[]){
			QuizFive s=new Circle1();//In real scenario, object is provided through method e.g. getShape() method
		s.draw();
		}
		}

// answer= drawing circle

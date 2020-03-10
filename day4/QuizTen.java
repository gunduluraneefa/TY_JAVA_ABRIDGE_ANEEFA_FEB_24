/*package com.capgemini.quiz.day4;

public class QuizTen {
	  int i;
      void display() 
      {
          System.out.println(i);
      }
  }    
  class B extends QuizTen 
  {
      int j;
      void display() 
      {
          System.out.println(j);
      }
  }    
  class method_overriding 
  {
      public static void main(String args[])
      {
          B obj = new B();
          obj.i=1;
          obj.j=2;   
          obj.display();     
      }
  }*/
/*Explanation: class A & class B both contain display() method, class B inherits class A, when display() method is called by object of class B, display() method of class B is executed rather than that of Class A.
  output:

  $ javac method_overriding.java
  $ java method_overriding
  2=answer*/
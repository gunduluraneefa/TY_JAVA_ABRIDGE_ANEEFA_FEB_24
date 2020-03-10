package com.capgemini.quiz.day4;

public class QuizSeven {
	 
	    
	        int i;
	        public void display() 
	        {
	            System.out.println(i);
	        }    
	    }    
	    class B extends QuizSeven 
	   {
	        int j;
	        public void display() 
	        {
	            System.out.println(j);
	        } 
	    }    
	    class Dynamic_dispatch 
	   {
	        public static void main(String args[])
	        {
	            B obj2 = new B();
	            obj2.i = 1;
	            obj2.j = 2;
	            QuizSeven r;
	            r = obj2;
	            r.display();     
	        }
	   }
//*Answer: b(2)
 //*Explanation: r is reference of type A, the program assigns a reference of object obj2 to r and uses that reference to call function display() of class B.
 //*output:
 //*$ javac Dynamic_dispatch.java
 //*$ java Dynamic_dispatch 
 //*2/
 
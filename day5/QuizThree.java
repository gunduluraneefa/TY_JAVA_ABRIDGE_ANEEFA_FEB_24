package com.capgemini.quiz.day5;

public class QuizThree {
    public int i;
    protected int j;
}    
class B extends QuizThree
{
    int j;
    void display() 
    {
        super.j = 3;
        System.out.println(i + " " + j);
    }
}    
class Output 
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.i=1;
        obj.j=2;   
        obj.display();     
}}
/*Explanation: Both class A & B have member with same name that is j, member of class B will be called by default if no specifier is used. I contains 1 & j contains 2, printing 1 2.
output:

$ javac Output.java
$ java Output
1 2==answer*/
package com.capgeemini.quiz.day2;

public class QuizOne {
public static void main(String[] args) {
	int num=2,p=5;
	long result=1;
	int i=p;
	for(;i!=0;--i)
	{
result*=num;
}
System.out.println(num+"^"+p+"="+result);
}}
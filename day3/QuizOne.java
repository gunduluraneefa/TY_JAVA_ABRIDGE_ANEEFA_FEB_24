package com.capgemini.quiz.day3;

public class QuizOne {
	String name;
	String movie;
	int price;
	int seats;

	 QuizOne(String name, String movie, int price, int seats) {
		this.name = name;
		this.movie = movie;
		this.price = price;
		this.seats = seats;
	}

	 QuizOne (String movie, int price, int seats) {
		this("anu", movie, price, seats);
	}

	void printBookingDetails() {
		System.out.println(
				"movie name is" + movie + "at a cost of" + price + "no.of seats are" + seats + "in the name of" + name);

	}

	public static void main(String[] args) {
		QuizOne q1 = new QuizOne("anu", "bahubali", 200, 2);
		q1.printBookingDetails();
		QuizOne q2 = new QuizOne("rajarani", 200, 4);
		q2.printBookingDetails();
	}
}

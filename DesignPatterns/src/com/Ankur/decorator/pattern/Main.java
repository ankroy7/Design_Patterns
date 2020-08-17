package com.Ankur.decorator.pattern;

public class Main {

	public static void main(String[] args) {
		CourtBooking cb1 = new GrassCourtBooking();
		System.out.println("cost :"+cb1.cost());
		cb1 = new BallPack(cb1);
		System.out.println("cost :"+cb1.cost());
		cb1 = new Coaching(cb1);
		System.out.println("cost :"+cb1.cost());
		
		System.out.println("Total Cost :"+cb1.cost());
		

	}

}

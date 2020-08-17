package com.Ankur.decorator.pattern;

public class Coaching extends TennisDecorator{
	
	CourtBooking cb;
	
	public Coaching(CourtBooking cb) {
		super();
		System.out.println("coaching");
		this.cb = cb;
	}

	@Override
	public int cost() {		
		return 250+cb.cost();
	}

	public Coaching() {
		super();
		
	}


}

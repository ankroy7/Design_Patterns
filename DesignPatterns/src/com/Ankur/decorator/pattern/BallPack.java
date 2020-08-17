package com.Ankur.decorator.pattern;

public class BallPack extends TennisDecorator{
	
	CourtBooking cb;
		
	public BallPack(CourtBooking cb) {
		super();
		System.out.println("Ball pack");
		this.cb = cb;
	}

	@Override
	public int cost() {		
		return 100+cb.cost();
	}

	public BallPack() {
		super();
		
	}


}

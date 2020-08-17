package com.Ankur.decorator.pattern;

  public class GrassCourtBooking implements CourtBooking {

	@Override
	public int cost() {
		return 300;
	}

	public GrassCourtBooking() {
		super();
		System.out.println("Grass Court");
	}


}

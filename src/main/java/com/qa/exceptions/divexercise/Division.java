package com.qa.exceptions.divexercise;

public class Division {
	public void divide(int x, int y) throws DivisionByLargerNumberException {
		if(y > x) {
			throw new DivisionByLargerNumberException();
		}
		
		Double result = (double) (x / y);
		System.out.println(x + " divided by " + y + " equals " + result);
	}

}

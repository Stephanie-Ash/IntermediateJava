package com.qa.exceptions.divexercise;

public class DivisionByLargerNumberException extends Exception {
	public DivisionByLargerNumberException() {
		super("This program cannot divide by a larger number!");
	}

}

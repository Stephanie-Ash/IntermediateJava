package com.qa.exceptions.runner;

import com.qa.exceptions.divexercise.Division;
import com.qa.exceptions.divexercise.DivisionHandler;
import com.qa.exceptions.divexercise.DivisionByLargerNumberException;

public class Runner {

	public static void main(String[] args) {
		DivisionHandler div = new DivisionHandler();
		
		div.divide();
	}

}

package com.qa.exceptions.divexercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionHandler {
	public void divide() {
		Scanner scan = new Scanner(System.in);
		Division division = new Division();
		
		while(true) {
			try {
				System.out.println("Please enter two numbers, the first will be divided by the second:");
				int numOne = scan.nextInt();
				int numTwo = scan.nextInt();
				division.divide(numOne, numTwo);
				break;
				
			} catch(InputMismatchException ime) {
				System.out.println("Both values must be integers, please try again...");
				scan.nextLine();
				continue;
			} catch(ArithmeticException ae) {
				System.out.println("Error cannot divide by zero, please try again...");
				scan.nextLine();
				continue;
			} catch(DivisionByLargerNumberException dblne) {
				System.out.println(dblne.getMessage());
			} catch(Exception e) {
				System.out.println("An error has ocurred, please check the message and try again " + e.getMessage());
				scan.nextLine();
				continue;
			}
		}
		
		scan.close();

	}
}

package com.qa.jdbc;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.qa.jdbc.domain.Customer;

public class UserInput {
	public void selectOption() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
				System.out.println(
						"Please select from the following options:\n  1. Create Customer\n  2. Find Customer\n  3. Update Customer\n"
						+ "  4. Delete Customer\n  5. Exit\n\nEnter 1, 2, 3, 4 or 5 below:");
				int selection = scan.nextInt();
				
				if(selection == 5) {
					System.out.println("Thank you, goodbye.");
					break;
				} else if(selection == 1) {
					createCustomer();
					break;
				} else if(selection == 2) {
					findCustomer();
					break;
				} else if(selection == 3) {
					updateCustomer();
					break;
				} else if(selection == 4) {
					deleteCustomer();
					break;
				} else {
					throw new InputMismatchException();
				}
				
			} catch (InputMismatchException ime) {
				System.out.println("You have entered an incorrect value. Please try again...");
				scan.nextLine();
				continue;
			} catch (Exception e) {
				System.out.println("An error has ocurred, please check the following message for information and try again:\n" + e.getMessage());
				scan.nextLine();
				continue;
			}
		}
		
		scan.close();
	}

	public void createCustomer() {
		System.out.println("Create Customer!");
	}
	
	public void findCustomer() {
		System.out.println("Find Customer!");
	}
	
	public void updateCustomer() {
		System.out.println("Update Customer!");
	}
	
	public void deleteCustomer() {
		System.out.println("Delete Customer!");
	}

}

package com.qa.jdbc;

import java.util.List;

import com.qa.jdbc.domain.Customer;

public class Runner {

	public static void main(String[] args) {
		TestingJDBC myJDBC = new TestingJDBC("jdbc:mysql://localhost:3306/julyenabledb", "root", "Pass1234");
		UserInput userIn = new UserInput();
		
//		myJDBC.testConnection();
		
//		Customer stephanie = new Customer("Stephanie", "Ashdown", "sashdown@email.com");
//		myJDBC.create(stephanie);
		
//		Customer rachel = new Customer("Rachel", "Clark", "rachel.clark@email.com");
//		myJDBC.create(rachel);
		
//		System.out.println(myJDBC.readCustomer(1));
		
//		List<Customer> customers = myJDBC.readAll();
//		for(Customer c : customers) {
//			System.out.println(c);
//		}
		
//		stephanie.setEmail("stephanie.ashdown5@email.com");
//		stephanie.setId(1);
//		System.out.println(myJDBC.update(stephanie));
		
//		myJDBC.delete(3);
		
		userIn.selectOption();

	}

}

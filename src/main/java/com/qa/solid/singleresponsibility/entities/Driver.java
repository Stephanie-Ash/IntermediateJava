package com.qa.solid.singleresponsibility.entities;

public class Driver {
	
	public void drive(Car car, int milesDriven) {
		car.setMileage(car.getMileage() + milesDriven);
	}

}

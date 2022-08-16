package com.qa.solid.singleresponsibility.runner;

import com.qa.solid.singleresponsibility.entities.Car;
import com.qa.solid.singleresponsibility.entities.Driver;
import com.qa.solid.singleresponsibility.entities.Mechanic;

public class Runner {

	public static void main(String[] args) {
		Car renault = new Car("red", "renault", 5000, false, 18);
		Driver stephanie = new Driver();
		Mechanic bob = new Mechanic();
		bob.setCar(renault);
		
		System.out.println(renault.getMileage());
		stephanie.drive(renault, 500);
		System.out.println(renault.getMileage());
		
		bob.addSpoiler();
		System.out.println(renault.isHasSpoiler());
		
		bob.sprayCar("blue");
		System.out.println(renault.getColour());
		
		bob.pumpTyres(29);
		System.out.println(renault.getTyrePressure());

	}

}

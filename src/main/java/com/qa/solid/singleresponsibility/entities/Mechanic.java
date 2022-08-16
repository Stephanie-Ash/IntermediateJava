package com.qa.solid.singleresponsibility.entities;

public class Mechanic {
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}

	public void sprayCar(String colour) {
		this.car.setColour(colour);
	}
	
	public void addSpoiler() {
		this.car.setHasSpoiler(true);
	}
	
	public void pumpTyres(int tyrePressure) {
		this.car.setTyrePressure(tyrePressure);
	}

}

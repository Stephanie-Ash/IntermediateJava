package com.qa.solid.singleresponsibility.entities;

public class Car {
	private String colour;
	private String make;
	private int mileage;
	private boolean hasSpoiler;
	private int tyrePressure;
	
	public Car(String colour, String make, int mileage, boolean hasSpoiler, int tyrePressure) {
		this.colour = colour;
		this.make = make;
		this.mileage = mileage;
		this.hasSpoiler = hasSpoiler;
		this.tyrePressure = tyrePressure;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public boolean isHasSpoiler() {
		return hasSpoiler;
	}

	public void setHasSpoiler(boolean hasSpoiler) {
		this.hasSpoiler = hasSpoiler;
	}

	public int getTyrePressure() {
		return tyrePressure;
	}

	public void setTyrePressure(int tyrePressure) {
		this.tyrePressure = tyrePressure;
	}

	@Override
	public String toString() {
		return "Car [colour=" + colour + ", make=" + make + ", mileage=" + mileage + "]";
	}

}

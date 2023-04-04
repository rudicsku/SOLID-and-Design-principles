package org.example.LiskovSubstitutionPrinciple;

public class ElectricCar extends Vehicle {

	public ElectricCar(String type, int age) {
		super(type, age);
	}

	@Override
	protected void speedUp() {
		System.out.println("Electric car is speeding up...");
	}
	
	@Override
	protected void slowDown() {
		System.out.println("Electric car is slowing down...");
	}
	
	@Override
	public void fuel() {
		//System.out.println("Electric car is being charged...");

		//Bad implementation, violating the Liskov principle
		throw new Error("Electric car not be fueled.");
	}
}

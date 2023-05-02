package org.example.SOLID.LiskovSubstitutionPrinciple;
/**
Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.

 The goal of the LSP is to create software systems that are more modular, flexible, and easy to maintain.
 By adhering to this principle, we can write code that is less coupled to specific implementations and more resilient to changes in the system.
 */
public class App {

	public static void main(String[] args) {
		
		Vehicle v = new PetrolCar("Toyota", 3);
		
		v.speedUp();
		v.slowDown();
		v.fuel();


		//Bad implementation, e.fuel throws error.
		Vehicle e = new ElectricCar("Tesla", 1);

		e.speedUp();
		e.slowDown();
		e.fuel();

		
	}
}

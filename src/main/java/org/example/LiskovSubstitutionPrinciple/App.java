package org.example.LiskovSubstitutionPrinciple;
/*
Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
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

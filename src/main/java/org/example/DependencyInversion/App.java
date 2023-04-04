package org.example.DependencyInversion;
/*
High-level modules should not depend on low-level modules. Both should depend on abstractions.

Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.
 */
public class App {

	public static void main(String[] args) {
		
		DatabaseController controller = new DatabaseController(new OracleDatabase());
		controller.connect();
		controller.disconnect();
		
	}
}

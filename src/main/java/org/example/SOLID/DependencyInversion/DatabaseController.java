package org.example.SOLID.DependencyInversion;

// the high level module
public class DatabaseController {

	// we program to an interface - so we can achieve loosely coupled architecture
	private final Database database;
	
	public DatabaseController(Database database) {
		this.database = database;
	}
	
	public void connect() {
		this.database.connect();
	}
	
	public void disconnect() {
		this.database.disconnect();
	}

	//Bad example
	//Tight bounding, when we program to a class (instead of an interface)
	//database = new MySQLDatabase();
}

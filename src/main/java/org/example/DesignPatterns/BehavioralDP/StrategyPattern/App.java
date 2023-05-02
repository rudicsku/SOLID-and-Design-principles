package org.example.DesignPatterns.BehavioralDP.StrategyPattern;

public class App {

	public static void main(String[] args) {
		
		OperationManagerBAD manager = new OperationManagerBAD();
		manager.execute(new Multiplication(), 10, 5);



		OperationManager manager1 = new OperationManager();
		manager1.setStrategy(new Addition());
		manager1.execute(10,5);
		
	}
}

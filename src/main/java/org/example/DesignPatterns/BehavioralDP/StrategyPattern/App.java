package org.example.DesignPatterns.BehavioralDP.StrategyPattern;

public class App {

	public static void main(String[] args) {
		
		OperationManagerBAD manager = new OperationManagerBAD();
		manager.execute(new Multiplication(), 10, 5);
		
	}
}

package org.example.DesignPatterns.StructuralDP.DecoratorPattern;

public abstract class BeverageDecorator implements Beverage {
	
	private final Beverage beverage;
	
	public BeverageDecorator(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost();
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription();
	}
}

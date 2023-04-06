package org.example.DesignPatterns.StructuralDP.DecoratorPattern;

public class Milk extends BeverageDecorator{

	private final Beverage beverage;
	
	public Milk(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost()+3;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+"milk ";
	}
}

package org.example.DesignPatterns.StructuralDP.DecoratorPattern;

public class Sugar extends BeverageDecorator{

	private final Beverage beverage;
	
	public Sugar(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost()+1;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+"sugar ";
	}
}
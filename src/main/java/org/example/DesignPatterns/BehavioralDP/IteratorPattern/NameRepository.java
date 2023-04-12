package org.example.DesignPatterns.BehavioralDP.IteratorPattern;

public class NameRepository {

	private final String[] names = { "Adam","Joe","John","Sarah" };
	
	public Iterator getIterator(){
		return new NameIterator(names);
	}
}

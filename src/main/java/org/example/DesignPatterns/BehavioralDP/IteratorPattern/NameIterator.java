package org.example.DesignPatterns.BehavioralDP.IteratorPattern;

import java.util.List;

public class NameIterator implements Iterator {
	
	private final String[] names;
	private int index;
	
	public NameIterator(String[] names){
		this.names = names;
	}
	
	@Override
	public boolean hasNext() {
		return index < this.names.length;
	}
	
	@Override
	public Object next() {
		
		if( hasNext() ){
			return this.names[index++];
		}
		
		return null;
	}
}

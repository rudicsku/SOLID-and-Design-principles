package org.example.DependencyInversion;

// this is the abstract layer
public interface Database {
	public void connect();
	public void disconnect();
}

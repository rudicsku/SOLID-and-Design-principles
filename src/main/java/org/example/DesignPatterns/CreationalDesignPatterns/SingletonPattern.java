package org.example.DesignPatterns.CreationalDesignPatterns;

/*
Creational design patter

The class has only one instance while providing global access to this instance.

When to use? - We can control access to a shared resource such as files, databases or thread pools.
 */
public class SingletonPattern {

    private static SingletonPattern singleton;

    //Private constructor, we are not able to instantiate the class
    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        //we just instantiate the class if necessary
        //what if we have multiple threads?
        if (singleton == null) {
            //this block can be entered by a single thread
            //Problem: this is slower
            synchronized (SingletonPattern.class) {
                singleton = new SingletonPattern();
            }
        }

        return singleton;
    }

    public void connect() {
        System.out.println("Connecting...");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }

    public static void main(String[] args) {
        SingletonPattern object1 = SingletonPattern.getInstance();
        SingletonPattern object2 = SingletonPattern.getInstance();

        if (object1 == object2)
            System.out.println("The objects are the same...");
    }
}

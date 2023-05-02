package org.example.DesignPatterns.CreationalDP;

/**
 * The class has only one instance while providing global access to this instance.
 * <p>
 * The Singleton pattern is useful in situations where there is a need to maintain a single instanceof a class
 * that controls access to a shared resource, such as a database connection, a thread pool, or a configuration file.
 * To implement the Singleton pattern in Java, you can define a private constructor for the class to prevent external instantiation,
 * and a static method that returns the single instance of the class.
 * <p>
 * When to use? - We can control access to a shared resource such as files, databases or thread pools.
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

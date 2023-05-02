package org.example.SOLID.SingleResponsibility;

/**
Single Responsibility Principle

Every class (or method) in a computer program should have responsibility over a single part of that program's functionality, which it should encapsulate.


In this example, the behaviour of each function are separated into different classes.
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");

        // we can get the values
        Pair pair = InputProcessor.getInputFromConsole();

        // check whether the inputs are fine or not
        if (!Validator.isValid(pair)) {
            System.out.println("One of the input is invalid...");
            return;
        }

        // maybe we can create a distinct class for this operation
        int firstInteger = Integer.parseInt(pair.getFirst());
        int secondInteger = Integer.parseInt(pair.getSecond());

        // do the mathematical operation
        int result = Operation.multiply(firstInteger, secondInteger);

        System.out.println("The result is: " + result);
        System.out.println("End of the application!");
    }
}

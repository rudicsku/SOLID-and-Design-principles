package org.example.DesignPatterns.CreationalDP;


// Define the interface for the Product
interface Product {
    void use();
}

// Define the concrete Product classes that implement the Product interface
class ConcreteProduct1 implements Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProduct1");
    }
}

class ConcreteProduct2 implements Product {
    @Override
    public void use() {
        System.out.println("Using ConcreteProduct2");
    }
}

// Define the Factory class that creates instances of the Product
class Factory {
    public Product createProduct(String productType) {
        if (productType.equals("Product1")) {
            return new ConcreteProduct1();
        } else if (productType.equals("Product2")) {
            return new ConcreteProduct2();
        } else {
            throw new IllegalArgumentException("Invalid product type: " + productType);
        }
    }
}


public class FactoryPattern {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product1 = factory.createProduct("Product1");
        product1.use(); // output: Using ConcreteProduct1

        Product product2 = factory.createProduct("Product2");
        product2.use(); // output: Using ConcreteProduct2
    }

    /**
     In other words, the Factory pattern encapsulates the object creation process in a separate class, called the factory,
     which can create objects of different types based on the input parameters provided to it.

     This pattern is useful in situations where there is a need to create objects of different types,
     but the exact type of object needed is not known until runtime. By using the Factory pattern,
     the creation of objects is centralized and can be changed easily without affecting the rest of the code.

     To implement the Factory pattern in Java, you can define an interface or an abstract class that specifies the object creation method,
     and create concrete implementations of this interface or abstract class that create objects of different types.
     */

}

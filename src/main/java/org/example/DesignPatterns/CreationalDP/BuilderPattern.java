package org.example.DesignPatterns.CreationalDP;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
class Person {
    private String firstName;
    private String lastName;
    private int age;
}

public class BuilderPattern {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .build();

        System.out.println(person.getFirstName() + " " + person.getLastName() + ", " + person.getAge());
    }
}

/**
 In other words, the Builder pattern is used to construct complex objects by breaking down the object creation process
 into smaller steps, allowing for greater flexibility and easier maintenance.

 The Builder pattern is useful in situations where there are many optional parameters that can be set when creating an object,
 or when there are different ways to create the same object.
 */

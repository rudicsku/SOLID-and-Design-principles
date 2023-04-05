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

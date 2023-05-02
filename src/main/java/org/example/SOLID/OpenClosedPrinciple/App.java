package org.example.SOLID.OpenClosedPrinciple;

/**
Software entities should be open for extension, but closed for modification.

 How to achieve?
 - Use abstraction
 - Use inheritance and polymorphism
 - Use composition
 - Use design patterns

In this example it is easy to add new features, without the need to modify the existing code.
 */
public class App {
    public static void main(String[] args) {
        InterviewQuestionProcessor.process(new MileStoneQuestions1());

        System.out.println();

        InterviewQuestionProcessor.process(new MileStoneQuestions2());

        System.out.println();

        InterviewQuestionProcessor.process(new MileStoneQuestions3());
    }
}

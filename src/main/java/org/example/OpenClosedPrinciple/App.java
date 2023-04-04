package org.example.OpenClosedPrinciple;

/*
Software entities should be open for extension, but closed for modification.

In this example it is easy to add new features, without the need to modify the existing code.
 */
public class App {
    public static void main(String[] args) {
        InterviewQuestionProcessor.process(new CSInterviewQuestions());
    }
}

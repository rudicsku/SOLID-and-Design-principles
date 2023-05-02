package org.example.SOLID.OpenClosedPrinciple;

import java.util.List;

public class MileStoneQuestions1 implements InterviewQuestion {

    private final List<String> questions1 = List.of(
            "First question from MileStone 1",
            "Second question from MileStone 1",
            "Third question from MileStone 1"
    );

    @Override
    public void askQuestions() {
        questions1.forEach(System.out::println);
    }
}

package org.example.SOLID.OpenClosedPrinciple;

import java.util.List;

public class MileStoneQuestions3 extends MileStoneQuestions2 implements InterviewQuestion {

    private final List<String> questions3 = List.of(
            "First question from MileStone 3",
            "Second question from MileStone 3",
            "Third question from MileStone 3"
    );

    @Override
    public void askQuestions() {
        super.askQuestions();
        questions3.forEach(System.out::println);
    }

}

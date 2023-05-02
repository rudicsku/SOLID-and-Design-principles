package org.example.SOLID.OpenClosedPrinciple;

import java.util.List;

public class MileStoneQuestions2 extends MileStoneQuestions1 implements InterviewQuestion{

    private final List<String> questions2 = List.of(
            "First question from MileStone 2",
            "Second question from MileStone 2",
            "Third question from MileStone 2"
    );

    @Override
    public void askQuestions() {
        super.askQuestions();
        questions2.forEach(System.out::println);
    }

}



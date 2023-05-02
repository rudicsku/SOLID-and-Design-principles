package org.example.SOLID.OpenClosedPrinciple;

public class InterviewQuestionProcessor {

	public static void process(InterviewQuestion question) {
		// this is an implementation of the loosely coupled system, this class knows nothing about the question and its type
		question.askQuestions();
	}
}

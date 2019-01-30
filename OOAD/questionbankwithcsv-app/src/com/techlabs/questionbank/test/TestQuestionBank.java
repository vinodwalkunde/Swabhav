package com.techlabs.questionbank.test;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.techlabs.questionbank.Option;
import com.techlabs.questionbank.Question;
import com.techlabs.questionbank.QuestionBank;

public class TestQuestionBank {
	static int wincount = 0;

	public static void main(String[] args) throws Exception {
		QuestionBank questionBank = new QuestionBank();

		List<Question> questions = questionBank.getQuestions();
		Random random = new Random();
		System.out.println(questions.toString());
		int size = questions.size();
		for (int i = 0; i < size; i++) {
			printDetails(questions.get(i));
		}

		System.out.println("Number of right Answer:" + wincount);

	}

	public static void printDetails(Question question) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println(question.getQuestion());
		List<Option> options = question.getOptions();
		for (Option option : options) {
			System.out.println(option.getOption());
		}
		int answer = sc.nextInt();
		if (new QuestionBank().checkResult(question, answer - 1)) {
			wincount++;
			System.out.println("Correct");
		}
	}

}

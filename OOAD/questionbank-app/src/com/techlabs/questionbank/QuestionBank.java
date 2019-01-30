package com.techlabs.questionbank;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
	private static List<Question> questions = new ArrayList<Question>();

	public QuestionBank() {
		initalsetOfQuestion();
	}

	public void initalsetOfQuestion() {
		List<Option> q1Option = new ArrayList<Option>();
		q1Option.add(new Option("1.Mumbai"));
		q1Option.add(new Option("2.Nagpur"));
		q1Option.add(new Option("3.Nashik"));
		Question question = new Question("What is Capital of Maharastra", q1Option, 0);
		questions.add(question);

		List<Option> q2Option = new ArrayList<Option>();
		q2Option.add(new Option("1.One"));
		q2Option.add(new Option("2.Two"));
		q2Option.add(new Option("3.Three"));
		q2Option.add(new Option("4.Four"));
		Question question2 = new Question("How Many legs Human have?", q2Option, 1);
		questions.add(question2);

		List<Option> q3Option = new ArrayList<Option>();
		q3Option.add(new Option("1.6"));
		q3Option.add(new Option("2.7"));
		q3Option.add(new Option("3.8"));
		q3Option.add(new Option("4.9"));
		Question question3 = new Question(
				"India is a federal union comprising twenty-nine states and how many union territories?", q3Option, 1);
		questions.add(question3);

		List<Option> q4Option = new ArrayList<Option>();
		q4Option.add(new Option("1.Itanagar"));
		q4Option.add(new Option("2.Dispur"));
		q4Option.add(new Option("3.Imphal"));
		q4Option.add(new Option("4.Shillong"));
		Question question4 = new Question("What is the capital of Arunachal Pradesh?", q4Option, 0);
		questions.add(question4);

		List<Option> q5Option = new ArrayList<Option>();
		q5Option.add(new Option("1.Maharashtra"));
		q5Option.add(new Option("2.Madhya Pradesh"));
		q5Option.add(new Option("3.Uttar Pradesh"));
		q5Option.add(new Option("4.Rajasthan"));
		Question question5 = new Question("Which state has the largest area?", q5Option, 3);
		questions.add(question5);

		List<Option> q6Option = new ArrayList<Option>();
		q6Option.add(new Option("1.Uttar Pradesh"));
		q6Option.add(new Option("2.Maharastra"));
		q6Option.add(new Option("3.Bihar"));
		q6Option.add(new Option("4.Andra Pradesh"));
		Question question6 = new Question("Which state has the largest population?", q6Option, 0);
		questions.add(question6);

	}

	public void addQuestion(List<Option> option, String question, int answerposition) {
		Question questionNew = new Question(question, option, answerposition);
		questions.add(questionNew);
	}

	public List<Question> getQuestionsByRange(int range) {
		List<Question> customList = new ArrayList<Question>();
		for (int i = 0; i < range; i++) {
			customList.add(questions.get(i));
		}

		return customList;
	}

	public boolean checkResult(Question question, int answer) {
		if (question.getAnswerposition() == answer) {
			return true;
		}
		return false;

	}

	public List<Question> getQuestions() {
		return questions;
	}

}

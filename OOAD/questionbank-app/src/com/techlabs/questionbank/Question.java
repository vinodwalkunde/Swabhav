package com.techlabs.questionbank;

import java.util.List;
import java.util.UUID;

public class Question {
	private UUID id = UUID.randomUUID();
	private String question;
	private List<Option> options;
	private int answerposition;

	public Question(String question, List<Option> options, int answerposition) {
		this.id = UUID.randomUUID();
		this.question=question;
		this.options = options;
		this.answerposition = answerposition;
	}

	public int getAnswerposition() {
		return answerposition;
	}

	public void setAnswerposition(int answerposition) {
		this.answerposition = answerposition;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public UUID getId() {
		return id;
	}

	public String getQuestion() {
		return question;
	}

	public List<Option> getOptions() {
		return options;
	}
	@Override
	public String toString() {
		return this.getQuestion();
	}

}

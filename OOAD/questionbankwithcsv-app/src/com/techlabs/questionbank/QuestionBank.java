package com.techlabs.questionbank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
	private static List<Question> questions = new ArrayList<Question>();
	private String path = "dataFile.csv";
	private String split = ",";

	public QuestionBank() throws Exception {
		loadDataFromFile();
	}

	public void loadDataFromFile() throws Exception {

		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			String[] linedata = line.split(split);

			String question = linedata[0];
			String option1 = linedata[1];
			String option2 = linedata[2];
			String option3 = linedata[3];
			String option4 = linedata[4];
			int answerposition = Integer.parseInt(linedata[5]);

			List<Option> q1Option = new ArrayList<Option>();
			q1Option.add(new Option(option1));
			q1Option.add(new Option(option2));
			q1Option.add(new Option(option3));
			q1Option.add(new Option(option4));

			Question singleQuestion = new Question(question, q1Option, answerposition);
			questions.add(singleQuestion);
		}
		bufferedReader.close();
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

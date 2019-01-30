package com.techlabs.questionbank.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techlabs.questionbank.Question;
import com.techlabs.questionbank.QuestionBank;

class QuestionBankTest {

	@Test
	void testForGetQuestionById() {
		QuestionBank questionBank = new QuestionBank();
		List<Question> questions = questionBank.getQuestions();
		Question question = questions.get(0);
		UUID id = questions.get(0).getId();
		assertEquals(id, question.getId());
	}

}

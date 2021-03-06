package com.xvitcoder.angualrspringapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xvitcoder.angualrspringapp.beans.Question;
import com.xvitcoder.angualrspringapp.dao.QuizDao;
@Service("quizService")
public class QuizServiceImpl implements QuizService {

	@Autowired
	QuizDao quizDao;
	
	@Override
	public List<Integer> getAllQuestionId() {
		return quizDao.getAllQuestionId();
	}

	@Override
	public List<Question> getQuestionAndAnswers(Integer questionId) {
		return quizDao.getQuestionAndAnswers(questionId);
	}

}

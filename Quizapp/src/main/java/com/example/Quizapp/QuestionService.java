package com.example.Quizapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class QuestionService {
	
	@Autowired
	QuestionRepo questionRepo;
	
	public List<Questions> getAllQuestions() {
		return questionRepo.findAll();
	}
	
	public List<Questions> getQuestionsByCategory(String category) {
		return questionRepo.findByCategory(category);
	}
	
	public String addQuestion(@RequestBody Questions questions) {
		questionRepo.save(questions);
		return "Success";
		
	}
}

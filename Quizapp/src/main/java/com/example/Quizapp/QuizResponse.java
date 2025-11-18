package com.example.Quizapp;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class QuizResponse {
	
	 private Integer id;
	 private String response;
	 public QuizResponse(Integer id, String response) {
		super();
		this.id = id;
		this.response = response;
	 }
	 public QuizResponse() {
		super();
	 }
	 public QuizResponse(String response) {
		super();
		this.response = response;
	 }
	 public Integer getId() {
		 return id;
	 }
	 public void setId(Integer id) {
		 this.id = id;
	 }
	 public String getResponse() {
		 return response;
	 }
	 public void setResponse(String response) {
		 this.response = response;
	 }

	 
}

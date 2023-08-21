package com.example.day1.Q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_2 {
	@Value("IamNeo")
	public String name;
	@RequestMapping("/dp")
	public String print() {
		return "Welcome "+name+"!";
	}
}

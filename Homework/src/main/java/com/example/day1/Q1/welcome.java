package com.example.day1.Q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
	@Value("WELCOME")
	public String message;
	@RequestMapping("/disp")
	public String display() {
		return message;
	}
}

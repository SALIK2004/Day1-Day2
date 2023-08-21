package com.example.day1.Q1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_3 {
	@Value("Green")
	public String FavColour;
	@RequestMapping("/color")
	public String Colour() {
		return "My favourite colour is "+FavColour;
	}
}

package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.childModel;
import com.example.demo.service.childService;






@RestController
public class childController {
	@Autowired
	childService cser;
	
	@PostMapping("/savegift")
	public childModel saveChildDetails(@RequestBody childModel cm)
	{
		return cser.saveDetails(cm);
	}
	@GetMapping("/getgift")
	public List<childModel> getDetails()
	{
		return cser.getDetails();
	}
}


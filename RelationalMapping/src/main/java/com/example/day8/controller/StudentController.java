package com.example.day8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day8.model.StudentModel;
import com.example.day8.repository.StudentRepo;





@RestController
public class StudentController {
	@Autowired
	StudentRepo srepo;
	
	@PostMapping("/post")
	public StudentModel insertingValue(@RequestBody StudentModel d)
	{
		return srepo.save(d);
		//return "Your data is saved successfully";
	}
	@GetMapping("/get")
	public List<StudentModel> gettingValue()
	{
		return srepo.findAll();
	}
}
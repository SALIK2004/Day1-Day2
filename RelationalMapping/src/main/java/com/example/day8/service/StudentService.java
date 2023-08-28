/*package com.example.day8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.day8.model.StudentModel;
import com.example.day8.repository.StudentRepo;

public class StudentService {
	@Autowired
	public StudentRepo srepo;
	
	public String posting(StudentModel sm)
	{
		srepo.save(sm);
		return "Your data is saved successfully";
	}
	public List<StudentModel> getting()
	{
		return srepo.findAll();
	}
}*/

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.childModel;
import com.example.demo.repository.childRepo;




@Service
public class childService {
	@Autowired
	
	childRepo crepo;
	
	public childModel saveDetails(childModel cm) {
		return crepo.save(cm);
	}
	public List<childModel> getDetails()
	{
		return crepo.findAll();
	}
	

}

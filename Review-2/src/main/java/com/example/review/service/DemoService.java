package com.example.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.review.model.DemoModel;

import com.example.review.repository.DemoRepo;

@Service
public class DemoService {
	@Autowired
	DemoRepo drepo;
	public DemoModel saveDetails(DemoModel u)
	{
		return drepo.save(u);
	}

	public String updateRow(String d, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DemoModel> getbyName(String d) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DemoModel> getBynamemodel(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getBymodelid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DemoModel> getAllrows() {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DemoModel> getspecificrows(String d, String p) {
		// TODO Auto-generated method stub
		return null;
	}

}
package com.example.day6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6.model.ChildModel;
import com.example.day6.repository.ChildRepo;



@Service
public class ChildService {
	@Autowired
	
	ChildRepo crepo;
	
	public ChildModel saveDetails(ChildModel cm) {
		return crepo.save(cm);
	}
	public List<ChildModel> getDetails()
	{
		return crepo.findAll();
	}
	public List<ChildModel> sortByAsc(String babyFirstName){
		return crepo.findAll(Sort.by(babyFirstName).descending());
	}
	public List<ChildModel>pagination(int pageNu,int pageSize)
	{
		Page<ChildModel>cont=crepo.findAll(PageRequest.of(pageNu, pageSize));
		return cont.getContent();
	}
	public List<ChildModel>paginationAndSorting(int pageNu,int pageSize,String babyFirstName)
	{
		Page<ChildModel>cont1=crepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(babyFirstName).descending()));
		return cont1.getContent();
	}

}

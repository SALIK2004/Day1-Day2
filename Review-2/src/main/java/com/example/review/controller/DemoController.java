package com.example.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review.model.DemoModel;
//import com.example.review.model.UserModel;
import com.example.review.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	@Lazy
	public DemoService dser;
@PostMapping("/saveDemo")   
	
	public DemoModel saveFuelStationDe(@RequestBody DemoModel u)
	{
		return dser.saveDetails(u);
	}
	
	
	  //get all the data
	  @GetMapping("/getAllrows")
	   public List<DemoModel> getallRows()
	   {
     		return dser.getAllrows();
	    }
		//get specific data
	   @GetMapping("getAllrowss/{d}/{p}")
	   public List<DemoModel> getSpecRows(@PathVariable String d,@PathVariable String p)
		{
			return dser.getspecificrows(d,p);
	     }
	//delete
	@DeleteMapping("/deleterow/{id}")
	public String deleted(@PathVariable("id") int id)
	{
		return dser.deleteByid(id)+" rows deleted";
	}
	
	//update
	@PutMapping("/updateRow/{d}/{id}")
	public String updateById(@PathVariable("d") String d,@PathVariable("id") int id)
	{
		return dser.updateRow(d,id)+" updated";
	}
	
	@GetMapping("/likeAllrows/{d}")
	public List<DemoModel> getbyname(@PathVariable("d") String d)
	{
		return dser.getbyName(d);
	}
	//using model query
	@GetMapping("/get/{name}")
	public List<DemoModel> getByname(@PathVariable("name") String name)
	{
		return dser.getBynamemodel(name);
	}
	//using model id
	@DeleteMapping("/thala/{id}")
	public String nav (@PathVariable("id") int id)
	{
	return dser.getBymodelid(id)+ " Deleted";
	}

}
package com.example.day7.jpql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day7.jpql.model.CarModel;
import com.example.day7.jpql.service.CarService;



@RestController
public class CarController {
	@Autowired
	public CarService cserv;
	
	//posting data
	@PostMapping("/insertingValue")
	public String insertingValue(@RequestBody CarModel d)
	{
		cserv.posting(d);
		return "Your data is saved successfully";
	}
	//getting data
	@GetMapping("/gettingValue")
	public List<CarModel> gettingValue()
	{
		return cserv.getting();
	}
	//get all row
		@GetMapping("/getAllrows")
		public List<CarModel> getAllRows()
		{
			return cserv.getAllRows();
		}
		//get data
		@GetMapping("/getSpecrows/{addr}/{carName}")
		public List<CarModel> getSpecrows(@PathVariable("addr") String addr,@PathVariable ("carName") String carName)
		{
			return cserv.getSpecrows(addr, carName);
		}
		//get data by char
		@GetMapping("/getByName/{char}")
		public List<CarModel> getByName(@PathVariable("char") String carName)
		{
			return cserv.getDataByChar(name);
		}
		//delete data
		@DeleteMapping("/deleteRow/{id}")
		public String deleteRow(@PathVariable("id") int id)
		{
			return cserv.deleteById(id)+" deleted";
		}
		//update the data
		@PutMapping("updateData/{address}/{id}")
		public String updateData(@PathVariable("address") String addr,@PathVariable("id") int id)
		{
			return cserv.updateData(addr, id)+" data is updated";
		}
		//get by model class
		@GetMapping("getting")
		public List<CarModel> getting()
		{
			return cserv.gettingmodel();
		}
		//get by model class
		@GetMapping("/getByModel/{carName}")
		public List<CarModel>  getByModel(@PathVariable("carName") String carName)
		{
			return cserv.getDatafromModel(carName);
		}
		
		//get data
		@GetMapping("/getSpecrowsbymodel/{addr}/{carName}")
		public List<CarModel> getSpecrowsbymodel(@PathVariable("addr") String addr,@PathVariable ("carName") String carName)
		{
			return cserv.getSpecrowsmodel(addr, carName);
		}
		
		//delete using model class
		@DeleteMapping("/delete/{id}")
		public int delete(@PathVariable("id") int id)
		{
			return cserv.deleteUsingmodel(id);
		}
		//update the data
		@PutMapping("updateDatabymodel/{address}/{id}")
		public String updateDatabymodel(@PathVariable("address") String addr,@PathVariable("id") int id)
		{
			return cserv.updateDatamodel(addr, id)+" data is updated";
		}


}
package com.example.day7.jpql.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day7.jpql.model.CarModel;
import com.example.day7.jpql.repository.CarRepo;



@Service
public class CarService {
	@Autowired
	public CarRepo crepo;
	
	//post data
	public String posting(CarModel d)
	{
		crepo.save(d);
		return "Your data is saved successfully";
	}
	//get data
	public List<CarModel> getting()
	{
		return crepo.findAll();
	}

	//get all data
	public List<CarModel> getAllRows()
	{
		return crepo.getAllRows();
	}
	//get Spec data
	public List<CarModel> getSpecrows(String addr,String carName)
	{
		return crepo.getSpecRows(addr, carName);
	}
	//get by Char
	public List<CarModel> getDataByChar(String carName)
	{
		return crepo.getByname(carName);
	}
	//delete the data
	public int deleteById(int id)
	{
		return crepo.deleteId(id);
	}
	//update the data 
	public int updateData(String addr,int no_id) {
		return crepo.updateById(addr, no_id);
	}
	
	//get using model class
	public List<CarModel> gettingmodel()
	{
		return crepo.get();
	}
	
	//get using model class
	public List<CarModel> getDatafromModel(String carName)
	{
		return crepo.getByName(carName);
	}
	
	// get specific data
    public List<CarModel> getSpecrowsmodel(String addr,String carName)
	{
		return crepo.getSpecRowsBymodel(addr, carName);
	}
	
	//delete using model class
	public int deleteUsingmodel(int id)
	{
		return crepo.deleteBymodel(id);
	}
	
	//updete by model
	public int updateDatamodel(String addr,int no_id) {
		return crepo.updateByIdmodel(addr, no_id);
	}

}
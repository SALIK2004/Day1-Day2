package com.example.review1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.review1.model.GiftModel;
import com.example.review1.repository.GiftRepo;

@Service
public class GiftService {
	@Autowired
	GiftRepo grepo;
	
	public GiftModel saveDetails(GiftModel gm) {
		return grepo.save(gm);
	}
	public GiftModel updateDetails(GiftModel gm) {
		return grepo.saveAndFlush(gm);
	}
	public void delete(int serialNum) {
		System.out.print("Deleted");
		grepo.deleteById(serialNum);
	}
	public boolean deleteGift(int serialNum) {
		if(grepo.existsById(serialNum)) {
			grepo.deleteById(serialNum);
			return true;
		}
		return false;
	}
	public Optional<GiftModel> getUserId(int userId)
	   {
		   Optional<GiftModel>gift=grepo.findById(userId);
		   if(gift.isPresent())
		   {
			   return gift;
		   }
		   return null;
	   }
	public void deleteDetails(int serialNum)
	{
	System.out.println("Deleted");
	grepo.deleteById(serialNum);
	}
	public List<GiftModel> getDetails()
	{
		return grepo.findAll();
	}
	
}

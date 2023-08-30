package com.example.review.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.review.model.UserModel;
import com.example.review.service.GiftService;



@RestController
public class GiftController {
	@Autowired
	GiftService gser;
	@PostMapping("/saveGift")   
	
	public UserModel saveFuelStationDe(@RequestBody UserModel u)
	{
		return gser.saveDetails(u);
	}
	@PutMapping("/updategift")
	public UserModel updateHotelDe(@RequestBody UserModel um) {
		return gser.updateDetails(um);
	}
	@DeleteMapping("/deletegift/{Id}")
	public ResponseEntity<String> deleteGiftInfo(@PathVariable int Id){
		boolean deleted = gser.deleteGift(Id);
		
		if (deleted) {
			return ResponseEntity.ok("Data in the " + Id+ "th row is deleted successfully...");
		}
		
		else{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Id+ "th row is not found...");
		}
		
	}
	@GetMapping("/users/{userId}")
	public ResponseEntity<?>getUserId(@PathVariable int userId)
	{
	Optional<UserModel>gift=gser.getUserId(userId);
	if(gift!=null) {
		return ResponseEntity.ok(gift); 
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not available in "+userId+"th row");
		
	}
	@GetMapping("/sortDesc/{userFirstName}")
	public List<UserModel> sortdesc(@PathVariable("userFirstName")String userFirstName){
		return gser.sortByDesc(userFirstName);
	}
	@GetMapping("/sortAesc/{userFirstName}")
	public List<UserModel> sortAesc(@PathVariable("userFirstName")String userFirstName){
		return gser.sortByAesc(userFirstName);
	}
	//pagination
	@GetMapping("/pagination/{num}/{size}")
	public List<UserModel> paginationEx(@PathVariable("num") int num,@PathVariable("size") int size)
	{
		return gser.pagination(num,size);
	}
	//pagination and sorting
	@GetMapping("/paginationAndSort/{num}/{size}/{userFirstName}")
	public List<UserModel> paginationAndSort(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("userFirstName")  String userFirstName)
	{
		return gser.paginationAndSorting(num,size,userFirstName);
	}
	
	@GetMapping("/getGift")
	public List<UserModel> getGiftDe()
	{
		return gser.getDetails();
	}

}

package com.example.review1.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.review1.model.GiftModel;
import com.example.review1.service.GiftService;

@RestController
public class GiftController {
	@Autowired
	GiftService gser;
	@PostMapping("/savegift")
	public GiftModel saveGiftDetails(@RequestBody GiftModel gm)
	{
		return gser.saveDetails(gm);
	}
	@PutMapping("/updategift")
	public GiftModel updateHotelDe(@RequestBody GiftModel gm) {
		return gser.updateDetails(gm);
	}
	@DeleteMapping("/delete/{serialNum}")
	public String deleteds(@PathVariable("serialNum")int serialNum) {
		gser.delete(serialNum);
		return "Data in the  "+serialNum+"th row is deleted....";
	}
	@DeleteMapping("/deletegift/{serialNum}")
	public ResponseEntity<String> deleteGiftInfo(@PathVariable int serialNum){
		boolean deleted = gser.deleteGift(serialNum);
		
		if (deleted) {
			return ResponseEntity.ok("Data in the " + serialNum+ "th row is deleted successfully...");
		}
		
		else{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(serialNum+ "th row is not found...");
		}
		
	}
	@GetMapping("/users/{userId}")
	public ResponseEntity<?>getUserId(@PathVariable int userId)
	{
	Optional<GiftModel>gift=gser.getUserId(userId);
	if(gift!=null) {
		return ResponseEntity.ok(gift); 
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Data not available in "+userId+"th row");
		
	}
	@DeleteMapping("/byrepparm")

	public String removedByRequestpam(@RequestParam("serialNum") int serialNum)

	{

		gser.deleteDetails(serialNum);

		return serialNum+"th row is deleted";

	}
	@GetMapping("/getgift")
	public List<GiftModel> getGiftDetails()
	{
		return gser.getDetails();
	}
}

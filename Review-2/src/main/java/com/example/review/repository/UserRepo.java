package com.example.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.review.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer>{
	
}

package com.example.review1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.review1.model.GiftModel;


public interface GiftRepo extends JpaRepository<GiftModel, Integer>{

}

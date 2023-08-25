package com.example.demo.repository;

//package com.example.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.childModel;

//import com.example.day6.model.ChildModel;

public interface childRepo extends JpaRepository<childModel,Integer>{

}

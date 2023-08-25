package com.example.day7.jpql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.day7.jpql.model.CarModel;

import jakarta.transaction.Transactional;
public interface CarRepo extends JpaRepository<CarModel, Integer> {
	
	//native Query
		@Query(value = "select * from carmodel",nativeQuery = true)
		public List<CarModel> getAllRows();
		
		@Query(value = "select * from carmodel where address =:addr and carName =:carName" ,nativeQuery = true)
		public List<CarModel> getSpecRows(@Param("addr") String addr,@Param("carName") String carName);
		
		//get by char
		@Query (value = "select * from carmodel where carName like %?1%",nativeQuery = true)
		public List<CarModel> getByname(@Param("carName") String carName);
		
		//delete using native query
		@Modifying
		@Transactional
		@Query(value = "delete from carmodel where id=:no_id",nativeQuery = true)
		public int deleteId(@Param("no_id") int id);
		
		@Modifying
		@Transactional
		@Query(value="update carmodel set address=:addr where id=:no_id",nativeQuery = true)
		public int updateById(@Param("addr") String addr,@Param("no_id") int id);
		
		//get by using model class
		@Query("select t from CarModel t")
		public List<CarModel> get();
		
		//get by name using model class
	    @Query("select t from  CarModel t where t.carName like %?1%")
	    public List<CarModel> getByName(@Param("carName") String carName);
	    
	    //get using id by model class
	    @Query("select t from CarModel t where t.address =:addr and t.carName =:carName")
		public List<CarModel> getSpecRowsBymodel(@Param("addr") String addr,@Param("carName") String carName);
		
	    
	    //delete by name using model
	    @Modifying
	    @Transactional
	    @Query("delete from CarModel t where t.id=:id")
	    public int deleteBymodel(@Param("id") int id);
	    

		@Modifying
		@Transactional
		@Query("update CarModel t set t.address=:addr where t.id=:no_id")
		public int updateByIdmodel(@Param("addr") String addr,@Param("no_id") int id);

}
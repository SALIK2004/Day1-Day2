package com.example.review.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.review.model.DemoModel;
//import com.example.review.model.UserModel;

import jakarta.transaction.Transactional;

public interface DemoRepo extends JpaRepository<DemoModel, Integer>{
	
	@Query(value="select * from DemoModel",nativeQuery=true)
	public List<DemoModel> getAllRows();

	@Query(value="select*from DemoModel where address=:d and name=:p",nativeQuery=true )
	public List<DemoModel> getSpecRows(@Param("d")String d,@Param("p")String p);
	
	@Query(value="select*from DemoModel where DemoModel like %?1",nativeQuery=true )
	public List<DemoModel> getbyname(@Param("d")String d);
	
	//delete using native query
	@Modifying
	@Transactional
	@Query(value="DELETE FROM DemoModel WHERE id=?1",nativeQuery=true)
	public int deleted(@Param("id")int id);
	
	//update the query
	@Modifying
	@Transactional
	@Query(value="update DemoModel set address=:d where Id=:id",nativeQuery=true)
	public Integer updateById(@Param("d")String d,@Param("id")int id);

	@Modifying
	@Transactional
	@Query("delete from DemoModel h where h.Id=:id")
	public int nav(@Param("id") int id);

	//public DemoModel save(DemoModel u);

	//public UserModel save(UserModel u);
}
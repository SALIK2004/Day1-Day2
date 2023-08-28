package com.example.day8.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class StudentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Student_id;
	private String name;
	private int roll_no;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_id",referencedColumnName = "Student_id")
	private List<Address> address;
	public long getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(long student_id) {
		Student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getroll_no() {
		return roll_no;
	}
	public void setroll_no(String roll_no) {
		roll_no = roll_no;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}	
}

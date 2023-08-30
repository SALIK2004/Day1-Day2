package com.example.review.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class OrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int OrderId;
	private int price;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_id",referencedColumnName = "Id")
	private List<DeliveryAddressModel> address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<DeliveryAddressModel> getAddress() {
		return address;
	}
	public void setAddress(List<DeliveryAddressModel> address) {
		this.address = address;
	}
	
}
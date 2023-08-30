package com.example.review.model;

import jakarta.persistence.CascadeType;

//import java.util.List;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class ProductsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int ProductId;
	private String ProductName;
	private int price;
	private String type;
	private String category;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_id",referencedColumnName = "Id")
	private OrderModel order;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public OrderModel getOrder() {
		return order;
	}
	public void setOrder(OrderModel order) {
		this.order = order;
	}
	
}

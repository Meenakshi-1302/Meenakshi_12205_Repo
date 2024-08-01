package com.ogs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_tbl")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Order Id")
	private int oid;
	@Column(name="Order type")
	private String type;
	@Column(name="Total Amount")
	private double amount;
	@Column(name="Delivery date")
	private String date;
	
	public Order() {
		super();
		
	}
	public Order(int oid, String type, double amount, String date) {
		super();
		this.oid = oid;
		this.type = type;
		this.amount = amount;
		this.date = date;
		
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	

}

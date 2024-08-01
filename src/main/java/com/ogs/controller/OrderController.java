package com.ogs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogs.model.Order;
import com.ogs.serviceimpl.OrderServiceImpl;

@RestController
@RequestMapping("/Order")
@CrossOrigin("*")
public class OrderController {
	
	OrderServiceImpl oservice;
	public OrderController(OrderServiceImpl oservice) {
		super();
		this.oservice = oservice;
	}
	
	@PostMapping
	public String insertOrder(@RequestBody Order ord) {
		String msg="";
		try {
			oservice.addOrder(ord);
			msg="Added";
		}
		catch(Exception e) {
			msg="Not added";
		}
		return msg;
	}
	
	@GetMapping("{oid}")
	public Order getOrders(@PathVariable("oid") int id) {
		return oservice.findOrderById(id);
	}
	
	@GetMapping("/all")
	public List<Order> getOrders(){
		return oservice.findAllOrders();
	}
	
	@PutMapping
	public String updateOrder(@RequestBody Order ord) {
		String msg="";
		try {
			oservice.updateOrder(ord);
			msg="Updated";
		}
		catch(Exception e) {
			msg="Not Updated";
		}
		return msg;
	}
	
	@DeleteMapping("{oid}")
	public String deleteOrder(@PathVariable("oid") int id) {
		String msg="";
		try {
			oservice.deleteOrder(id);
			msg="Order Deleted";
		}
		catch(Exception e) {
			msg="Order Not Deleted";
		}
		return msg;
	}
	
	

}

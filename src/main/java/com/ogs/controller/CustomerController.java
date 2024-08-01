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
import com.ogs.model.Customer;
import com.ogs.serviceimpl.CustomerServiceImpl;



@RestController
@RequestMapping("/Customer")
@CrossOrigin("*")
public class CustomerController {
	
	CustomerServiceImpl cservice;

	public CustomerController(CustomerServiceImpl cservice) {
		super();
		this.cservice = cservice;
	}
	
	@PostMapping
	public String insertCustomer(@RequestBody Customer cus) {
		String msg="";
		try {
			cservice.addCustomer(cus);
			msg="Success";
		}
		catch(Exception e) {
			msg="Failure";
		}
		return msg;
		
	}
	@GetMapping("{cid}")
	public Customer getCustomerById(@PathVariable("cid") int id) {
		return cservice.findCustomerById(id);
		
	}
	@GetMapping("/all")
	public List<Customer> getCustomers(){
		return cservice.findAllCustomers();
	}
	
	@PutMapping
	public String updateCustomer(@RequestBody Customer cus) {
		String msg="";
		try {
			cservice.updateCustomer(cus);
			msg="Updated";
		}
		catch(Exception e) {
			msg="Not Updated";
		}
		return msg;
		
	}
	@DeleteMapping("{cid}")
	public String deleteCustomer(@PathVariable("cid") int id) {
		String msg="";
		try {
			cservice.deleteCustomer(id);
			msg="Deleted";
		}
		catch(Exception e) {
			msg="Not Deleted";
		}
		return msg;
	}
	
	

}

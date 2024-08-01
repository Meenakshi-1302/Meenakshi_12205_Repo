package com.ogs.service;

import java.util.List;

import com.ogs.model.Customer;

public interface CustomerService {
	public String addCustomer(Customer cus);
	public String updateCustomer(Customer cus);
	public String deleteCustomer(int id);
	public List<Customer> findAllCustomers();
	public Customer findCustomerById(int id);

}

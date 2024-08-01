package com.ogs.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ogs.model.Customer;
@Repository
public interface CustomerRepo {
	public String addCustomer(Customer cus);
	public String updtae(Customer cus);
	public String delete(int cid);
	public List<Customer> findAllCustomers();
	public Customer findById(int cid);

}

package com.ogs.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ogs.model.Customer;
import com.ogs.repo.CustomerRepo;
import com.ogs.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	CustomerRepo crepo;
	public CustomerServiceImpl(CustomerRepo crepo) {
		super();
		this.crepo = crepo;
	}

	@Override
	public String addCustomer(Customer cus) {
		if(cus!=null) {
		 crepo.addCustomer(cus);
		 return "success";
		}else {
			return "failure";
		}
		
		
		
	}

	@Override
	public String updateCustomer(Customer cus) {
		crepo.updtae(cus);
		System.out.println("Customer service");
		return "Success";
		
		
	}

	@Override
	public String deleteCustomer(int id) {
		 return crepo.delete(id);
//		 return "Success";
		
		
		
	}

	@Override
	public List<Customer> findAllCustomers() {
		
		return crepo.findAllCustomers();
	}

	@Override
	public Customer findCustomerById(int id) {
		
		return crepo.findById(id);
	}

}

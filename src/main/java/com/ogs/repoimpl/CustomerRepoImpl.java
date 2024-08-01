package com.ogs.repoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ogs.model.Customer;
import com.ogs.repo.CustomerRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepoImpl implements CustomerRepo {
	
	EntityManager em;
	

	public CustomerRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public String addCustomer(Customer cus) {
		if(cus!=null) {
		em.merge(cus);
		return "success";
		}
		else {
			return "insertion failed";
		}
		
	}

	@Override
	public String updtae(Customer cus) {
		if(cus!=null) {
			em.merge(cus);
			return"success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public String delete(int cid) {
//		Customer id = em.find(Customer.class,cid);
//		em.remove(id);
		Optional<Customer> customerOptional = Optional.empty();
		if(customerOptional.isPresent()) {
			em.remove(customerOptional);
			return "success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public List<Customer> findAllCustomers() {
		String hql = "from Customer";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Customer findById(int cid) {
		return em.find(Customer.class, cid);
	}

}

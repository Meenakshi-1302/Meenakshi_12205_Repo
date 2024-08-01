package com.ogs.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ogs.model.Order;
import com.ogs.repo.OrderRepo;
import com.ogs.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	OrderRepo orepo;

	public OrderServiceImpl(OrderRepo orepo) {
		super();
		this.orepo = orepo;
	}

	@Override
	public String addOrder(Order ord) {
		if(ord!=null) {
		orepo.save(ord);
		System.out.println("Order");
		return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public String updateOrder(Order ord) {
		if(ord!=null) {
		orepo.update(ord);
		System.out.println("Order");
		return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public String deleteOrder(int id) {
		orepo.delete(id);
		return "success";
	}

	@Override
	public List<Order> findAllOrders() {
		
		return orepo.findAllOrders();
	}

	@Override
	public Order findOrderById(int id) {
		
		return orepo.findById(id);
	}
	public List<Integer> getAllId(){
		List<Integer> idList = orepo.getIdList();
		return idList;
		
	}
	
	

}

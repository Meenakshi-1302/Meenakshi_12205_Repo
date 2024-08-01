package com.ogs.service;

import java.util.List;
import com.ogs.model.Order;

public interface OrderService {
	public String addOrder(Order ord);
	public String updateOrder(Order ord);
	public String deleteOrder(int id);
	public List<Order> findAllOrders();
	public Order findOrderById(int id);

}

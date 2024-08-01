package com.ogs.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ogs.model.Order;

@SpringBootTest
class OrderServiceImplTest {
	
	@Autowired 
	OrderServiceImpl orderserviceimpl;

	@Test
	void testAddOrder() {
		Order order = new Order(12,"veggies",500.50,"25.08.24");
		assertEquals("Insertion Successfull",orderserviceimpl.addOrder(order));
	}
	@Test
	void testAddOrderFailure() {
		Order order = null;
		assertEquals("Insertion Failure",orderserviceimpl.addOrder(order));
	}
	@Test
	void testUpdateOrder() {
		Order order = new Order(12,"grocery",520.50,"3.08.24");
		assertEquals("Updation Success",orderserviceimpl.updateOrder(order));
	}
	@Test
	void testUpdateOrderFailure() {
		Order order = null;
		assertEquals("Updation Failed",orderserviceimpl.updateOrder(order));
		
	}
	@Test
	void testFindOrderById() {
		Order order = new Order();
		order = orderserviceimpl.findOrderById(2);
		assertNotNull(order);
	}
	@Test
	void testFindOrderByIdFailure() {
		Order order = new Order();
		order = orderserviceimpl.findOrderById(99);
		assertNotNull(order);
	}
	@Test
	void testFindAllOrder() {
		assertNotNull(orderserviceimpl.findAllOrders());
	}
	@Test
	void testDeleteOrderById() {
		assertEquals("Deletion Success",orderserviceimpl.deleteOrder(2));
	}
	

}

package com.ogs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ogs.model.Order;
@Repository
public interface OrderRepo {
	public String save(Order ord);
	public String update(Order ord);
	public String delete(int oid);
	public List<Order> findAllOrders();
	public Order findById(int oid);
	@Query("select oid from Order")
	public List<Integer> getIdList();

}

package com.ogs.repoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ogs.model.Order;
import com.ogs.repo.OrderRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderRepoImpl implements OrderRepo {
	
	EntityManager em;
	public OrderRepoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public String save(Order ord) {
		if(ord!=null) {
		em.merge(ord);
		return "success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public String update(Order ord) {
		if(ord!=null) {
			em.merge(ord);
			return "success";
		}
		else {
			return "failure";
		}
		
		
	}

	@Override
	public String delete(int oid) {
//		Order id = em.find(Order.class, oid);
//		em.remove(id);
		Optional<Order> orderOptional = Optional.empty();
		if(orderOptional.isPresent()) {
			em.remove(orderOptional);
			return "success";
		}
		else {
			return "failure";
		}
		
	}

	@Override
	public List<Order> findAllOrders() {
		String hql = "from Order";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public Order findById(int oid) {
		return em.find(Order.class, oid);
		
	}

	@Override
	public List<Integer> getIdList() {
		return getIdList();
	}

}

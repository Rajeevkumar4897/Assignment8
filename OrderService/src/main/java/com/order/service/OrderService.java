package com.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	 private OrderRepository repo;
	
	
	public Order getOrderById(Integer orderId) {
		Optional<Order> order = repo.findById(orderId);
		return order.get();
	}


	public Order saveOrder(Order order) {
		
		return repo.save(order);
	}

}
	
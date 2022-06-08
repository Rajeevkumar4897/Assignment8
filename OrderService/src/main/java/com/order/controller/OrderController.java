package com.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.Order;
import com.order.service.OrderService;

@RestController
public class OrderController {
private OrderService orderService;
	
	@PostMapping("/saveOrder")
	public Order saveOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}

	@GetMapping("/getOrderById/{orderId}")
	public Order getOrderById(@PathVariable Integer orderId) {
		return orderService.getOrderById(orderId);
	}
	
}
	


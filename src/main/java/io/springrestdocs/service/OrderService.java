package io.springrestdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springrestdocs.model.Order;
import io.springrestdocs.resource.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Order getOrder(Integer id) {
		return orderRepository.findById(id).orElse(null);
	}

	public List<Order> getOrders() {
		return (List<Order>)orderRepository.findAll();
	}

	public List<Order> saveOrder(List<Order> orderList) {
		return (List<Order>) orderRepository.saveAll(orderList);		
	}

}

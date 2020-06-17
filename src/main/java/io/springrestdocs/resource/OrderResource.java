package io.springrestdocs.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springrestdocs.model.Order;
import io.springrestdocs.service.OrderService;

@RestController
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/getorder/{id}")
	public Order getOrderById(@PathVariable Integer id) {
		System.out.println("inside getOrderById");
		return orderService.getOrder(id);
	}
	
	@GetMapping("/getorders")
	public List<Order> listOrder(){
		System.out.println("inside getOrders");
		return orderService.getOrders();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/placeorder")
	public List<Order> placeOrder(@RequestBody List<Order> orderList){
		System.out.println("inside placeOrder");
		return orderService.saveOrder(orderList);
	}
	
}

package io.springrestdocs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TB")
public class Order {

	@Id
	private int orderId;
	private String name;
	private int price;
	private int quantity;
	
	public Order(){
		
	}
	
	public Order(int orderId, String name, int price, int quantity) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

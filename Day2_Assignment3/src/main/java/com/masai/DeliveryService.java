package com.masai;

public class DeliveryService {
	private OrderService orderService;
	private String str;

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void deliverOrder() {
		// TODO Auto-generated method stub
		System.out.println("Delivering order of " + str);
		System.out.println("Delivered Successfully.");
		System.out.println("Thank you for the purchase.");
	}
}

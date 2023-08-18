package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.NotFoundException;
import com.masai.model.Order;
import com.masai.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public Order getOrderById(Long id) {
		return orderRepository.findById(id).orElseThrow(() -> new NotFoundException("Order not found"));
	}

	public Order createOrder(Order order) {
		return orderRepository.save(order);
	}

	public String deleteOrder(Long id) {
		Order order = orderRepository.findById(id).orElseThrow(() -> new NotFoundException("Order not found"));

		orderRepository.delete(order);
		return "Deleted Successfully.";
	}

	public List<Order> getOrdersByCustomerPhone(String customerPhone) {
		return orderRepository.findByCustomerPhone(customerPhone);
	}
}

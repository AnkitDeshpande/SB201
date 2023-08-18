package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Order;
import com.masai.service.OrderService;

@RestController
@RequestMapping
public class OrderController {
	@Autowired
	private OrderService orderService;

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllOrders() {
		List<Order> orders = orderService.getAllOrders();
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}

	@GetMapping("/orders/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
		Order order = orderService.getOrderById(id);
		return new ResponseEntity<>(order, HttpStatus.OK);
	}

	@PostMapping("/orders")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		Order createdOrder = orderService.createOrder(order);
		return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
	}

	@DeleteMapping("/orders/{id}")
	public ResponseEntity<String> deleteOrder(@PathVariable Long id) {

		return new ResponseEntity<>(orderService.deleteOrder(id), HttpStatus.NO_CONTENT);
	}

	@GetMapping("/orders/{customerPhone}")
	public ResponseEntity<List<Order>> getOrdersByCustomerPhone(@PathVariable String customerPhone) {
		List<Order> orders = orderService.getOrdersByCustomerPhone(customerPhone);
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}
}
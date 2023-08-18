package com.masai.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customer_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 100)
	private String customerName;

	@NotBlank
	@Size(max = 20)
	private String customerPhone;

	@NotNull
	private Long menuItemId;

	@NotNull
	private LocalDate orderDate;

	@NotNull
	private double totalPrice;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(@NotBlank @Size(max = 100) String customerName, @NotBlank @Size(max = 20) String customerPhone,
			@NotNull Long menuItemId, @NotNull LocalDate orderDate, @NotNull double totalPrice) {
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.menuItemId = menuItemId;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Long getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(Long menuItemId) {
		this.menuItemId = menuItemId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
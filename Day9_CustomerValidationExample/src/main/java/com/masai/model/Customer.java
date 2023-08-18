package com.masai.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Pattern.Flag;

public class Customer {
	@NotNull(message = "Please Provide a Valid ID.")
	@Min(value = 1L, message = "Id must be positive Integer i.e > 0")
	private Integer id;

	@NotBlank(message = "please provide a valid name.")
	private String name;

	@NotNull
	@PastOrPresent(message = "please provid a valid date [YYYY-MM-DD] between today or past")
	private LocalDate lastPurchaseDate;

	@NotNull(message = "please provide email.")
	@Email(regexp = "[a-z0-9.]+@[a-z0-9.]+\\.[a-z]{2,3}", flags = Flag.CASE_INSENSITIVE, message = "please provide a valid email.")
	private String email;

	@Pattern(regexp = "[6-9][0-9]{9}", message = "pleae provide 10 digit Indian Mobile Number")
	private String mobile;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String name, LocalDate lastPurchaseDate, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.lastPurchaseDate = lastPurchaseDate;
		this.email = email;
		this.mobile = mobile;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getLastPurchaseDate() {
		return lastPurchaseDate;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastPurchaseDate(LocalDate lastPurchaseDate) {
		this.lastPurchaseDate = lastPurchaseDate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}

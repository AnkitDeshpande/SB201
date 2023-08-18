package com.masai;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seller_id;

	private String seller_name;
	private int year_of_experience;
	private String email;

	@OneToMany(mappedBy = "seller")
	private Set<Store> workingStores = new HashSet<>();

	// Getters and Setters
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(String seller_name, int year_of_experience, String email) {
		super();
		this.seller_name = seller_name;
		this.year_of_experience = year_of_experience;
		this.email = email;
	}

	public Long getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(Long seller_id) {
		this.seller_id = seller_id;
	}

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public int getYear_of_experience() {
		return year_of_experience;
	}

	public void setYear_of_experience(int year_of_experience) {
		this.year_of_experience = year_of_experience;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Store> getWorkingStores() {
		return workingStores;
	}

	public void setWorkingStores(Set<Store> workingStores) {
		this.workingStores = workingStores;
	}

	@Override
	public String toString() {
		return "Seller [seller_id=" + seller_id + ", seller_name=" + seller_name + ", year_of_experience="
				+ year_of_experience + ", email=" + email + "]";
	}

}

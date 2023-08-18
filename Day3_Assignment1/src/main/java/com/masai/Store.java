package com.masai;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long store_id;

	private String store_name;
	private String location;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "store_buyer", joinColumns = @JoinColumn(name = "store_id"), inverseJoinColumns = @JoinColumn(name = "buyer_id"))
	private Set<Buyer> buyers = new HashSet<>();

	// Getters and Setters
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(String store_name, String location) {
		super();
		this.store_name = store_name;
		this.location = location;
	}

	public Long getStore_id() {
		return store_id;
	}

	public void setStore_id(Long store_id) {
		this.store_id = store_id;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Set<Buyer> getBuyers() {
		return buyers;
	}

	public void setBuyers(Set<Buyer> buyers) {
		this.buyers = buyers;
	}

	@Override
	public String toString() {
		return "Store [store_id=" + store_id + ", store_name=" + store_name + ", location=" + location + ", seller="
				+ seller + ", buyers=" + buyers + "]";
	}

}
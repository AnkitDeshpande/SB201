package com.masai;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Buyer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long buyer_id;

	private String name;
	private String email;
	private String mobile;

	@ManyToMany(mappedBy = "buyers", cascade = CascadeType.ALL)
	private Set<Store> favoriteStores = new HashSet<>();

	// Getters and Setters
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Buyer(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public Long getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(Long buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Set<Store> getFavoriteStores() {
		return favoriteStores;
	}

	public void setFavoriteStores(Set<Store> favoriteStores) {
		this.favoriteStores = favoriteStores;
	}

	@Override
	public String toString() {
		return "Buyer [buyer_id=" + buyer_id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

}
package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CinemaHall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hallId;
	@NotBlank
	private String name;
	@NotBlank
	private String location;

	public CinemaHall(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
}

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
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long screenId;
	@NotBlank
	private String name;
	@NotBlank
	private Long hallId;
	@NotBlank
	private int seatingCapacity;

	public Screen(String name, Long hallId, int seatingCapacity) {
		super();
		this.name = name;
		this.hallId = hallId;
		this.seatingCapacity = seatingCapacity;
	}

}

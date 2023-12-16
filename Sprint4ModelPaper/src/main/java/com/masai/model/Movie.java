package com.masai.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
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
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;
	@NotBlank
	private String title;
	@NotBlank
	private String genre;
	@Min(value = 1)
	private int duration;
	//@FutureOrPresent
	private LocalDateTime screeningTime;

	public Movie(String title, String genre, int duration, LocalDateTime screeningTime) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.screeningTime = screeningTime;
	}

}

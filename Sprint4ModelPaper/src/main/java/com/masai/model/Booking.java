package com.masai.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "booking_movies", joinColumns = @JoinColumn(name = "booking_id"), inverseJoinColumns = @JoinColumn(name = "movie_id"))
	private List<Movie> movies = new ArrayList<>();

	@NotNull(message = "Date is required")
	private LocalDate date;

	@NotNull(message = "Time is required")
	private LocalTime time;

	@Min(value = 1, message = "Number of tickets must be at least 1")
	private int numberOfTickets;

	public Booking(User user, List<Movie> movies, @NotNull(message = "Date is required") LocalDate date,
			@NotNull(message = "Time is required") LocalTime time,
			@Min(value = 1, message = "Number of tickets must be at least 1") int numberOfTickets) {
		super();
		this.user = user;
		this.movies = movies;
		this.date = date;
		this.time = time;
		this.numberOfTickets = numberOfTickets;
	}

}

package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Booking;
import com.masai.model.User;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUser(User user);
}

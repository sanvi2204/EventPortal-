package com.max.quizspring.repo;

import com.max.quizspring.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRequestRepository extends JpaRepository<Booking, Long> {
}
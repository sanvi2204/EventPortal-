package com.max.quizspring.service;




import com.max.quizspring.model.Booking;
import com.max.quizspring.repo.BookingRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    
    @Autowired
    private BookingRequestRepository repo;

    public Booking submitBookingRequest(Booking request) {
        return repo.save(request);
    }
}
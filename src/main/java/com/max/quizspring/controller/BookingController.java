package com.max.quizspring.controller;



import com.max.quizspring.model.Booking;
import com.max.quizspring.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")

public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/submit")
    public ResponseEntity<Booking> submitBookingRequest(@RequestBody Booking request) {
        Booking savedRequest = bookingService.submitBookingRequest(request);
        return ResponseEntity.ok(savedRequest);
    }
}


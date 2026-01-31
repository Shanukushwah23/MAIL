package com.kushwah.shanu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import com.kushwah.shanu.entity.BookingRequest;
import com.kushwah.shanu.service.EmailService;




@RestController
@RequestMapping("/api/booking")
@CrossOrigin("*")
public class MyController {

    @Autowired
    private EmailService emailService;
    
    @GetMapping("/")
    public String health() {
        return "Mail service is running 🚀";
    }

    @PostMapping
    public ResponseEntity<String> bookWedding(@RequestBody BookingRequest request) {
        emailService.sendBookingMail(request);
        return ResponseEntity.ok("Booking sent");
    }
}







package com.kushwah.shanu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kushwah.shanu.entity.BookingRequest;

@Service
public class EmailService {

        @Autowired
        private JavaMailSender mailSender;

        public void sendBookingMail(BookingRequest req) {

            SimpleMailMessage mail = new SimpleMailMessage();

            mail.setFrom("shanukushwah845@gmail.com");   // sender
            mail.setTo(req.getEmail());                  // receiver

            mail.setSubject("Wedding Booking Confirmation");

            mail.setText(
                "Hello " + req.getName() + ",\n\n" +
                "Thank you for your booking request.\n\n" +
                "Wedding Date: " + req.getWeddingDate() + "\n" +
                "Venue: " + req.getVenue() + "\n" +
                "Style: " + req.getStyle() + "\n" +
                "Budget: " + req.getBudget() + "\n\n" +
                "We will contact you soon.\n\n" +
                "Regards,\nShanu Photography"
            );

            mailSender.send(mail);

            System.out.println("MAIL METHOD EXECUTED ✅");
        }
    }


    


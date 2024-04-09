package com.bus.BusBooking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.BusBooking.request.BookingRequest;

@RestController
@RequestMapping("/booking")
public class BusBookingController {

	@PostMapping("/bookSeat")
	public ResponseEntity<?> saveBooking(@RequestBody BookingRequest bookingRequest){
		return null;
	}
}

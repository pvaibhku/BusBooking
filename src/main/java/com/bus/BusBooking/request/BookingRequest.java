package com.bus.BusBooking.request;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingRequest {
	
	private String pickUpLocation;
	private String dropLocation;
	private LocalDateTime bookingTime;
	private long noOfSeats;
	private long userID;
	private List<Passenger> passengerDetails;

}

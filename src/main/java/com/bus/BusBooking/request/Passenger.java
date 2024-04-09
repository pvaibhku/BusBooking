package com.bus.BusBooking.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Passenger {

	private String name;
	private long age;
	private String seatNumber;
}

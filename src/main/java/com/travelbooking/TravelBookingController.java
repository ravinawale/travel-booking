package com.travelbooking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelBookingController {

	@GetMapping("/booking")
	public String getBooking() {
		return "Hello";
	}
	
	
}

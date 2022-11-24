package com.travelbooking;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelbooking.Model.Flight;

@RestController
@RequestMapping("travelbooking")
public class FlightController {

	@GetMapping("/myflight")
	@ResponseBody
	public ResponseEntity<Flight> getflight() {
		return ResponseEntity.ok(new Flight(new Date(),new Date(),"Pune","Delhi"))
							 .status(HttpStatus.OK)
							 .build();
	}
}

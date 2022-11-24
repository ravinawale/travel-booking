package com.travelbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelbooking.Model.Flight;
import com.travelbooking.dao.FlightDao;

@RestController
@RequestMapping("travelbooking")
public class FlightController {

	@Autowired
	FlightDao flightDao;
	
	@GetMapping(path="/myflight",produces = "application/json")
	public ResponseEntity<Flight> getflight() {
		return new ResponseEntity<Flight>(flightDao.getFlight(),HttpStatus.OK);
	}
}

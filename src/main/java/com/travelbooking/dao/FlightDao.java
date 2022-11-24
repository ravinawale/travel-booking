package com.travelbooking.dao;

import org.springframework.stereotype.Component;

import com.travelbooking.Model.Flight;

@Component
public interface FlightDao {
	public Flight getFlight();
}

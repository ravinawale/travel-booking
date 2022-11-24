package com.travelbooking.dao.impl;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.travelbooking.Model.Flight;
import com.travelbooking.dao.FlightDao;

@Component
public class FlightDaoImpl implements FlightDao{
	public Flight getFlight() {
		System.out.println("Inside FlightDaoImpl ...");
		return new Flight(new Date(),new Date(),"Pune","Delhi");
	}
}

package com.travelbooking.Model;

import java.util.Date;

public class Flight {

	private Date departureTime; 
	private Date arrivalTime;
	private String departureAirport; 
	private String arrivalAirport;
	
	public Flight(Date departureTime, Date arrivalTime, String departureAirport, String arrivalAirport) {
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
	}
	
	
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	
}

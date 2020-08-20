package com.bus.dto;

import java.time.format.DateTimeFormatter;

import com.bus.entity.BusEntity;

public class BusDTO 
{
	private Long busId;
	private String busNumber;
	private String operatorName;
	private String departureTime;
	private String arrivalTime;
	private String duration;
	private Double price;
	
		
	public BusDTO(BusEntity busEntity) {
		super();
		this.busId = busEntity.getBusId();
		this.busNumber = busEntity.getBusNumber();
		this.operatorName = busEntity.getOperatorName();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	    String departureTime = busEntity.getDepartureTime().format(formatter);
	    this.departureTime = departureTime;
	    String arrivalTime = busEntity.getArrivalTime().format(formatter);
	    this.arrivalTime = arrivalTime;
	        
		this.departureTime = busEntity.getDepartureTime().toString();
		this.duration = busEntity.getDuration();
		this.price = busEntity.getPrice();
	}
	
	public Long getBusId() {
		return busId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}

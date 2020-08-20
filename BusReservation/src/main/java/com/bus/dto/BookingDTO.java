package com.bus.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class BookingDTO 
{

	private Long busID;
	private String sheetNo;
	private String name;
	private String mobileNumber;
	private Integer status;
	
	public Long getBusID() {
		return busID;
	}
	public void setBusID(Long busID) {
		this.busID = busID;
	}
	public String getSheetNo() {
		return sheetNo;
	}
	public void setSheetNo(String sheetNo) {
		this.sheetNo = sheetNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "BookingEntity [bookingId=" + bookingId + ", busID=" + busID + ", sheetNo=" + sheetNo + ", name=" + name
				+ ", mobileNumber=" + mobileNumber + ", status=" + status + "]";
	}	
	

}

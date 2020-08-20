package com.bus.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class BookingEntity 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookingid")
	private Long bookingId;
	@Column(name = "busid")
	private Long busID;
	@Column(name = "sheetno")
	private String sheetNo;
	@Column(name = "name")
	private String name;
	@Column(name = "mobilenumber")
	private String mobileNumber;
	@Column(name = "status")
	private Integer status;
	
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
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

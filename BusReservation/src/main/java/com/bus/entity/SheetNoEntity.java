package com.bus.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sheetings")
public class SheetNoEntity 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sheetid")
	private Long sheetID;
	@Column(name = "sheetno")
	private String sheetNo;
	@Column(name = "sheettype")
	private String sheetType;
	
	public Long getSheetID() {
		return sheetID;
	}
	public void setSheetID(Long sheetID) {
		this.sheetID = sheetID;
	}
	public String getSheetNo() {
		return sheetNo;
	}
	public void setSheetNo(String sheetNo) {
		this.sheetNo = sheetNo;
	}
	public String getSheetType() {
		return sheetType;
	}
	public void setSheetType(String sheetType) {
		this.sheetType = sheetType;
	}

	
	

}

package com.bus.dto;

import java.util.List;

public class BusSheetingDetailDTO 
{

	private List<SheetDTO> sheetDTOs;
	private Integer totalSheet;
	private Integer bookedSheet;
	private Integer avilableSheet;
	

	public List<SheetDTO> getSheetDTOs() {
		return sheetDTOs;
	}

	public void setSheetDTOs(List<SheetDTO> sheetDTOs) {
		this.sheetDTOs = sheetDTOs;
	}

	public Integer getTotalSheet() {
		return totalSheet;
	}

	public void setTotalSheet(Integer totalSheet) {
		this.totalSheet = totalSheet;
	}

	public Integer getBookedSheet() {
		return bookedSheet;
	}

	public void setBookedSheet(Integer bookedSheet) {
		this.bookedSheet = bookedSheet;
	}

	public Integer getAvilableSheet() {
		return avilableSheet;
	}

	public void setAvilableSheet(Integer avilableSheet) {
		this.avilableSheet = avilableSheet;
	}
	
	
}

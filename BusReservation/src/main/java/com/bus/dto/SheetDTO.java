package com.bus.dto;

public class SheetDTO 
{

	private String sheetNo;
	private Integer status;
	private String avilabilty;
	
	public SheetDTO(String sheetNo, Integer status) 
	{
		setSheetNo(sheetNo);
		setStatus(status);
	}
	
	public String getSheetNo() {
		return sheetNo;
	}
	public void setSheetNo(String sheetNo) {
		this.sheetNo = sheetNo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		
		this.status = status;
		
		if(status == null || status.equals(0))
		{
			this.avilabilty = "Avilable";
		}
		else if((status & 1) == 1)
		{
			this.avilabilty = "Booked";
		}
		else if((status & 2) == 2)
		{
			this.avilabilty = "Blocked";
		}
		
	}
	public String getAvilabilty() {
		return avilabilty;
	}	
	
	@Override
	public boolean equals(Object obj) 
	{
		boolean result = false;
		
		if(obj instanceof SheetDTO)
		{
			result = ((SheetDTO) obj).sheetNo.equals(this.sheetNo);
		}

		return result;
	}
	
	@Override
	public int hashCode() {
		return this.sheetNo.hashCode();        
	}
	
}

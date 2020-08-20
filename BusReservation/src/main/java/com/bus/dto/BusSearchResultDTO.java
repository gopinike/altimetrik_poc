package com.bus.dto;

import java.util.List;

public class BusSearchResultDTO 
{

	private List<BusDTO> busDTOList;
	private int totatlNoResult;
	
	public BusSearchResultDTO(List<BusDTO> busDTOList) 
	{
		this.busDTOList = busDTOList;
		this.totatlNoResult = busDTOList.size();
	}
		
	public List<BusDTO> getBusDTOList() {
		return busDTOList;
	}
	public void setBusDTOList(List<BusDTO> busDTOList) {
		this.busDTOList = busDTOList;
	}
	public int getTotatlNoResult() {
		return totatlNoResult;
	}
	
	/*
	 * public void setTotatlNoResult(int totatlNoResult) { this.totatlNoResult =
	 * totatlNoResult; }
	 */
}

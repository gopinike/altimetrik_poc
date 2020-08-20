package com.bus.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dto.BusSheetingDetailDTO;
import com.bus.dto.SheetDTO;
import com.bus.entity.BookingEntity;
import com.bus.repository.BookingsRepository;

@Service
public class BookingsService 
{

	@Autowired
	private BookingsRepository bookingsRepository;

	public BusSheetingDetailDTO getBusSheetDetails(Long busID) 
	{
		List<BookingEntity> bookingEntities = bookingsRepository.findAllBybusID(busID);
		return getSheetingDetails(bookingEntities);		
	}

	private BusSheetingDetailDTO getSheetingDetails(List<BookingEntity> bookingEntities) 
	{
		HashMap<String, SheetDTO> sheetMap = getDefaultDetails(bookingEntities);
		BusSheetingDetailDTO busSheetingDetailDTO = new BusSheetingDetailDTO();
		
		for (BookingEntity bookingEntity : bookingEntities) 
		{
		
			String sheetNo = bookingEntity.getSheetNo();
			if(sheetMap.containsKey(sheetNo))
			{
				sheetMap.get(sheetNo).setStatus(bookingEntity.getStatus());
			}
			
		}
		
		List<SheetDTO> sheetDTOs = new ArrayList<SheetDTO>(sheetMap.values());
		
		busSheetingDetailDTO.setSheetDTOs(sheetDTOs);
		
		Integer totalSheet = sheetDTOs.size();
		Integer bookedSheet = bookingEntities.size();
		Integer avilableSheet = totalSheet - bookedSheet;
		
		busSheetingDetailDTO.setAvilableSheet(avilableSheet);
		busSheetingDetailDTO.setAvilableSheet(avilableSheet);
		busSheetingDetailDTO.setBookedSheet(bookedSheet);
		busSheetingDetailDTO.setTotalSheet(totalSheet);
		
		return busSheetingDetailDTO;
		
		
	}

	private HashMap<String, SheetDTO> getDefaultDetails(List<BookingEntity> bookingEntities) 
	{
		HashMap<String, SheetDTO> sheetMap = new HashMap<String, SheetDTO>();
		
		String defaultNo = "S";
		Integer defaultSheet = 5;
		SheetDTO sheetDTO;
		
		for (int i = 1; i <= defaultSheet; i++) 
		{
			
			sheetDTO = new SheetDTO(defaultNo+i,0);
			sheetMap.put(defaultNo+i,sheetDTO);			
		}		
		
		return sheetMap;
		
	}
	
}

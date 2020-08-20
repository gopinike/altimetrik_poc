package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bus.dto.BusSheetingDetailDTO;
import com.bus.service.BookingsService;


@RestController
@RequestMapping("/bus")
public class BookingController 
{

	@Autowired
	private BookingsService BookingsService;
	
	@GetMapping("/sheetDetails")
	public BusSheetingDetailDTO getBusSheetDetails( @RequestParam("busID") Long busID) throws Exception { //("busSearch")

		System.out.println(busID);
		
		if(busID == null || busID.equals(0))
		{
			throw new Exception("Invalid ");
		}
		
		return BookingsService.getBusSheetDetails(busID);
		
	} 
	
	@GetMapping("/bookSheet")
	public BusSheetingDetailDTO bookTicket( @RequestBody Long busID) throws Exception { //("busSearch")

		System.out.println(busID);
		
		return BookingsService.getBusSheetDetails(busID);
		
	} 
	
}

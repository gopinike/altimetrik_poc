package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bus.dto.BookingDTO;
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
			throw new Exception("Invalid Bus No");
		}
		
		return BookingsService.getBusSheetDetails(busID);
		
	} 
	
	@PostMapping("/bookSheet")
	public BookingDTO bookTicket( @RequestBody BookingDTO bookingDTO) throws Exception { //("busSearch")

		// need to add validation
		
		return BookingsService.saveOrUpdateBooking(bookingDTO,false);
		
	} 
	
	@PostMapping("/cancelBooking")
	public BookingDTO cancelTicket( @RequestBody BookingDTO bookingDTO) throws Exception { //("busSearch")

		// need to add validation
		
		return BookingsService.saveOrUpdateBooking(bookingDTO,true);
		
	} 
}

package com.bus.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bus.dto.BusSearchDTO;
import com.bus.dto.BusSearchResultDTO;
import com.bus.repository.BookingsRepository;
import com.bus.service.BusService;

import net.bytebuddy.implementation.bytecode.Throw;


@RestController
@RequestMapping("/bus")
public class BookingController 
{

	@Autowired
	private BookingsRepository bookingsRepository;
	
	@GetMapping("/details")
	public void greeting( @RequestParam("busID") Long busID) throws Exception { //("busSearch")

		System.out.println(busID);
		
		System.out.println(bookingsRepository.findAllBybusID(busID));
		
	} 
	
}

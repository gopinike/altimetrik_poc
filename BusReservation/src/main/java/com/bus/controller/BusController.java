package com.bus.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.dto.BusSearchDTO;
import com.bus.dto.BusSearchResultDTO;
import com.bus.service.BusService;

import net.bytebuddy.implementation.bytecode.Throw;


@RestController
@RequestMapping("/bus")
public class BusController 
{

	@Autowired
	private BusService busService;
	
	@RequestMapping("/search")
	public Optional<BusSearchResultDTO> getBusList(@Valid @RequestBody BusSearchDTO busSearchDTO, BindingResult bindingResult) throws Exception { 
		
		if(bindingResult.hasErrors())
		{
			StringBuffer errorDetails = new StringBuffer();
			
			bindingResult.getFieldErrors().forEach(fieldError -> 
			{
				errorDetails.append("Error : "+fieldError.getDefaultMessage() +" Field : "+fieldError.getField() +" Value :  "+fieldError.getRejectedValue());
			});
			
			throw new Exception(errorDetails.toString());
			
		}
		
		return busService.search(busSearchDTO);
	} 
	
}

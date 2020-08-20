package com.bus.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dto.BusSearchDTO;
import com.bus.entity.BusEntity;
import com.bus.repository.BusRepository;

@Service
public class BusFactory 
{
	@Autowired
	private BusRepository busRepository;
	
	public List<BusEntity> search(BusSearchDTO busSearchDTO) 
    { 
		String sourceCity = busSearchDTO.getSourceCity();
		String destinationCity = busSearchDTO.getDestinationCity();
		String travelDateString =  busSearchDTO.getTravelDate();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
		LocalDate travelDate =  LocalDate.parse(travelDateString,formatter);
		LocalDate nextDate = travelDate.plusDays(1);
		Integer sortType = busSearchDTO.getSortType();
		
		
        if (sortType.equals(1)) { 
            return busRepository.sourcustomSearchByPrice(sourceCity, destinationCity, travelDate, nextDate); 
        } 
        else if(sortType.equals(2)) { 
        	return busRepository.sourcustomSearchByOperator(sourceCity, destinationCity, travelDate, nextDate);
        } 
        else if(sortType.equals(3)) { 
        	return busRepository.sourcustomSearchByDeparturetime(sourceCity, destinationCity, travelDate, nextDate);
        } 
        else if(sortType.equals(4)) { 
        	return busRepository.sourcustomSearchByArrivaltime(sourceCity, destinationCity, travelDate, nextDate);
        } 
        else if(sortType.equals(5)) { 
        	return busRepository.sourcustomSearchByDuration(sourceCity, destinationCity, travelDate, nextDate);
        } 
        else { 
        	 return busRepository.sourcustomSearchByPrice(sourceCity, destinationCity, travelDate, nextDate); 
        } 
    } 
}

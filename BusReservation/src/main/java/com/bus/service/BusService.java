package com.bus.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.dto.BusDTO;
import com.bus.dto.BusSearchDTO;
import com.bus.dto.BusSearchResultDTO;
import com.bus.entity.BusEntity;

@Service
public class BusService {

	@Autowired
	private BusFactory busFactory;
	
	public Optional<BusSearchResultDTO> search(BusSearchDTO busSearchDTO) {
		List<BusEntity> busEntities = busFactory.search(busSearchDTO);
		List<BusDTO> busdtolist = busEntities.stream().map(s -> new BusDTO(s)).collect(Collectors.toList());
		Optional<BusSearchResultDTO> busSearchResultDTO = Optional.of(new BusSearchResultDTO(busdtolist));///
		
		return busSearchResultDTO;
	}

}

package com.example.viaflight_back.service.inLayoverAirportInfo;

import java.util.List;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.dto.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight_back.repository.inLayoverAirport.AirportEventsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AirportEventsService {

	private final AirportEventsDBFrameRepository airportEventsDBFrameRepository;

	public List<AirportEventsDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		Double layoverArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());
		List<AirportEventsDBFrameDto> airportEventsDBFrameDtoListDDD = airportEventsDBFrameRepository.findOpenPlaces(layoverAirportId, layoverArrivalTime).stream().map(AirportEventsDBFrameDto::from).toList();

		return airportEventsDBFrameDtoListDDD;
	}

}

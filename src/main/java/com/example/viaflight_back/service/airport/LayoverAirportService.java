package com.example.viaflight_back.service.airport;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.domain.airport.LayoverAirportDBFrame;
import com.example.viaflight_back.dto.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight_back.repository.airport.LayoverAirportDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class LayoverAirportService {

	private final LayoverAirportDBFrameRepository layoverAirportDBFrameRepository;


	public LayoverAirportDBFrameDto load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);

		LayoverAirportDBFrame layoverAirportDB = layoverAirportDBFrameRepository.findByLayoverAirportId(layoverAirportId).orElseThrow(NullPointerException::new);

		LayoverAirportDBFrameDto layoverAirportDBFrameDto = LayoverAirportDBFrameDto.from(layoverAirportDB);

		return layoverAirportDBFrameDto;
	}


}

package com.example.viaflight_back.service.outLayoverAirport;

import java.util.List;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.domain.outLayoverAirport.FreeTourDBFrame;
import com.example.viaflight_back.dto.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight_back.repository.outLayoverAirport.FreeTourDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class FreeTourService {

	private final FreeTourDBFrameRepository freeTourDBFrameRepository;

	public List<FreeTourDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		List<FreeTourDBFrame> freeTourDBFrames = freeTourDBFrameRepository.findByLayoverAirportId(layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1));
		List<FreeTourDBFrameDto> freeTourDBFrameDtos = freeTourDBFrames.stream().map(FreeTourDBFrameDto::from).toList();

		return freeTourDBFrameDtos;
	}


}

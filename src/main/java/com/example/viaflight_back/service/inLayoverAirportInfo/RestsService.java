package com.example.viaflight_back.service.inLayoverAirportInfo;

import java.util.List;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.dto.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight_back.repository.inLayoverAirport.RestsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RestsService {

	private final RestsDBFrameRepository restsDBFrameRepository;

	public List<RestsDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		Double layoverArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());
		List<RestsDBFrameDto> mealOptionsDBFrameDtoList = restsDBFrameRepository.findOpenPlaces(layoverAirportId, layoverArrivalTime).stream().map(RestsDBFrameDto::from).toList();

		return mealOptionsDBFrameDtoList;
	}

}

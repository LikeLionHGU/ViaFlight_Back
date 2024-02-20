package com.example.viaflight_back.service.inLayoverAirportInfo;

import java.util.List;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.dto.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight_back.repository.inLayoverAirport.MealOptionsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MealOptionsService {
	private final MealOptionsDBFrameRepository mealOptionsDBFrameRepository;

	public List<MealOptionsDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		Double layoverArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());
		List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList = mealOptionsDBFrameRepository.findOpenPlaces(layoverAirportId, layoverArrivalTime).stream().map(MealOptionsDBFrameDto::from).toList();

		return mealOptionsDBFrameDtoList;
	}

}

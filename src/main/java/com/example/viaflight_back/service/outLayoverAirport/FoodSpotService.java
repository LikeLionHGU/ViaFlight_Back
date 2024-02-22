package com.example.viaflight_back.service.outLayoverAirport;

import java.util.List;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.domain.outLayoverAirport.FoodSpotDBFrame;
import com.example.viaflight_back.dto.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight_back.repository.outLayoverAirport.FoodSpotDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class FoodSpotService {

	private final FoodSpotDBFrameRepository foodSpotDBFrameRepository;

	public List<FoodSpotDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		double TourArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());

		List<FoodSpotDBFrame> foodSpotDBFrames = foodSpotDBFrameRepository.findOpenFoodSpot(layoverAirportId, TourArrivalTime);
		List<FoodSpotDBFrameDto> foodSpotDBFrameDtos = foodSpotDBFrames.stream().map(FoodSpotDBFrameDto::from).toList();

		return foodSpotDBFrameDtos;

	}

}

package com.example.viaflight_back.service;

import java.util.List;
import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.controller.response.LayoverAirportOutResponse;
import com.example.viaflight_back.dto.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight_back.dto.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight_back.dto.outLayoverAirport.PaidActivityDBFrameDto;
import com.example.viaflight_back.service.outLayoverAirport.FoodSpotService;
import com.example.viaflight_back.service.outLayoverAirport.FreeTourService;
import com.example.viaflight_back.service.outLayoverAirport.PaidActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class OutLayoverAirportInfoService {
	private final FoodSpotService foodSpotService;
	private final FreeTourService freeTourService;
	private final PaidActivityService paidActivityService;

	public LayoverAirportOutResponse load(LayoverAirportRequest layoverAirportRequest) {
		List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList = foodSpotService.load(layoverAirportRequest);
		List<FreeTourDBFrameDto> freeTourDBFrameDtoList = freeTourService.load(layoverAirportRequest);
		List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList = paidActivityService.load(layoverAirportRequest);

		return new LayoverAirportOutResponse(foodSpotDBFrameDtoList, freeTourDBFrameDtoList, paidActivityDBFrameDtoList);

	}

}

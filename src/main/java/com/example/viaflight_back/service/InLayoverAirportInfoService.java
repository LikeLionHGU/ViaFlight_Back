package com.example.viaflight_back.service;

import java.util.List;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.controller.response.LayoverAirportInResponse;
import com.example.viaflight_back.dto.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight_back.service.inLayoverAirportInfo.AirportEventsService;
import com.example.viaflight_back.service.inLayoverAirportInfo.MealOptionsService;
import com.example.viaflight_back.service.inLayoverAirportInfo.RestsService;
import com.example.viaflight_back.service.inLayoverAirportInfo.ShoppingOptionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class InLayoverAirportInfoService {
	private final AirportEventsService airportEventsService;
	private final MealOptionsService mealOptionsService;
	private final RestsService restsService;
	private final ShoppingOptionsService shoppingOptionsService;

	public LayoverAirportInResponse load(LayoverAirportRequest layoverAirportRequest) {

		List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList = airportEventsService.load(layoverAirportRequest);
		List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList = mealOptionsService.load(layoverAirportRequest);
		List<RestsDBFrameDto> restsDBFrameDtoList = restsService.load(layoverAirportRequest);
		List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList = shoppingOptionsService.load(layoverAirportRequest);
		return new LayoverAirportInResponse(airportEventsDBFrameDtoList, mealOptionsDBFrameDtoList, restsDBFrameDtoList, shoppingOptionsDBFrameDtoList);
	}

}

package com.example.viaflight_back.controller.response;

import java.util.List;

import com.example.viaflight_back.dto.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight_back.dto.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight_back.dto.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight_back.dto.outLayoverAirport.PaidActivityDBFrameDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AllInfoAboutLayoverAirportResponse {

	LayoverAirportDBFrameDto layoverAirport;

	List<AirportEventsDBFrameDto> airportEvents;
	List<MealOptionsDBFrameDto> foods;
	List<RestsDBFrameDto> rests;
	List<ShoppingOptionsDBFrameDto> shopping;

	List<FoodSpotDBFrameDto> foodSpot;
	List<FreeTourDBFrameDto> freeTour;
	List<PaidActivityDBFrameDto> activity;

	public AllInfoAboutLayoverAirportResponse(LayoverAirportDBFrameDto layoverAirportDBFrameDto, List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList, List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList, List<RestsDBFrameDto> restsDBFrameDtoList, List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList, List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList, List<FreeTourDBFrameDto> freeTourDBFrameDtoList, List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList) {
		this.layoverAirport = layoverAirportDBFrameDto;

		this.airportEvents = airportEventsDBFrameDtoList;
		this.foods = mealOptionsDBFrameDtoList;
		this.rests = restsDBFrameDtoList;
		this.shopping = shoppingOptionsDBFrameDtoList;

		this.foodSpot = foodSpotDBFrameDtoList;
		this.freeTour = freeTourDBFrameDtoList;
		this.activity = paidActivityDBFrameDtoList;
	}

}

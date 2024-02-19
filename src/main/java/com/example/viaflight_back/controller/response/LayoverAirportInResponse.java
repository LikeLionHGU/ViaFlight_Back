package com.example.viaflight_back.controller.response;

import java.util.List;

import com.example.viaflight_back.dto.inLayoverAirportDto.AirportEventsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.MealOptionsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.RestsDBFrameDto;
import com.example.viaflight_back.dto.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LayoverAirportInResponse {
	List<AirportEventsDBFrameDto> airportEvents;
	List<MealOptionsDBFrameDto> foods;
	List<RestsDBFrameDto> rests;
	List<ShoppingOptionsDBFrameDto> shopping;

	public LayoverAirportInResponse (List<AirportEventsDBFrameDto> airportEventsDBFrameDtoList, List<MealOptionsDBFrameDto> mealOptionsDBFrameDtoList, List<RestsDBFrameDto> restsDBFrameDtoList, List<ShoppingOptionsDBFrameDto> shoppingOptionsDBFrameDtoList) {
		this.airportEvents = airportEventsDBFrameDtoList;
		this.foods = mealOptionsDBFrameDtoList;
		this.rests = restsDBFrameDtoList;
		this.shopping = shoppingOptionsDBFrameDtoList;
	}

}

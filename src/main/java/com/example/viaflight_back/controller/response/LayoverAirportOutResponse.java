package com.example.viaflight_back.controller.response;

import java.util.List;

import com.example.viaflight_back.dto.outLayoverAirport.FoodSpotDBFrameDto;
import com.example.viaflight_back.dto.outLayoverAirport.FreeTourDBFrameDto;
import com.example.viaflight_back.dto.outLayoverAirport.PaidActivityDBFrameDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LayoverAirportOutResponse {

	List<FoodSpotDBFrameDto> foodSpot;
	List<FreeTourDBFrameDto> freeTour;
	List<PaidActivityDBFrameDto> activity;

	public LayoverAirportOutResponse(List<FoodSpotDBFrameDto> foodSpotDBFrameDtoList, List<FreeTourDBFrameDto> freeTourDBFrameDtoList, List<PaidActivityDBFrameDto> paidActivityDBFrameDtoList) {
		this.foodSpot = foodSpotDBFrameDtoList;
		this.freeTour = freeTourDBFrameDtoList;
		this.activity = paidActivityDBFrameDtoList;
	}

}

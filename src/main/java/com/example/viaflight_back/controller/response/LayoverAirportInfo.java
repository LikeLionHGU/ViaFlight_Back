package com.example.viaflight_back.controller.response;

import com.example.viaflight_back.dto.airportDto.LayoverAirportDBFrameDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LayoverAirportInfo {

	LayoverAirportDBFrameDto layoverAirport;

	public LayoverAirportInfo (LayoverAirportDBFrameDto layoverAirportDBFrameDto) {
		this.layoverAirport = layoverAirportDBFrameDto;
	}

}

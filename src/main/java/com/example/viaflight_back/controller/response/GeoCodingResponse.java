package com.example.viaflight_back.controller.response;

import lombok.Data;

@Data
public class GeoCodingResponse {

	private Double lat;
	private Double lng;

	public GeoCodingResponse(Double lat, Double lng) {
		this.lat = lat;
		this.lng = lng;
	}

}

package com.example.viaflight_back.dto.outLayoverAirport;

import com.example.viaflight.domain.frameAboutDB.outLayoverAirport.FreeTourDBFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FreeTourDBFrameDto {
	private String freeTourName;
	private String Route;
	private String businessTime;
	private String information;
	private String cost;
	private String homepage;
	private String type;
	private String imageURL;
	private String layoverAirportId;

	public static FreeTourDBFrameDto from(FreeTourDBFrame freeTourDBFrame) {
		return FreeTourDBFrameDto.builder()
			.freeTourName(freeTourDBFrame.getFreeTourName())
			.Route(freeTourDBFrame.getRoute())
			.businessTime(freeTourDBFrame.getBusinessTime())
			.information(freeTourDBFrame.getInformation())
			.cost(freeTourDBFrame.getCost())
			.homepage(freeTourDBFrame.getHomepage())
			.type(freeTourDBFrame.getType())
			.imageURL(freeTourDBFrame.getImageURL())
			.layoverAirportId(freeTourDBFrame.getLayoverAirportId())
			.build();
	}


}

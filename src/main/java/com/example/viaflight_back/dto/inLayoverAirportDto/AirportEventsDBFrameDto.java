package com.example.viaflight_back.dto.inLayoverAirportDto;

import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.AirportEventsDBFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AirportEventsDBFrameDto {

	private String eventName;
	private String location;
	private Double openTime;
	private Double closeTime;
	private String businessHours;
	private String information;
	private String cost;
	private String reservationUrl;
	private String type;
	private String layoverAirportId;
	private String imageURL;

	public static AirportEventsDBFrameDto from(AirportEventsDBFrame airportEventsDBFrame) {
		return AirportEventsDBFrameDto.builder()
				.eventName(airportEventsDBFrame.getEventName())
				.location(airportEventsDBFrame.getLocation())
				.openTime(airportEventsDBFrame.getOpenTime())
				.closeTime(airportEventsDBFrame.getCloseTime())
				.businessHours(airportEventsDBFrame.getBusinessHours())
				.information(airportEventsDBFrame.getInformation())
				.cost(airportEventsDBFrame.getCost())
				.reservationUrl(airportEventsDBFrame.getReservationUrl())
				.type(airportEventsDBFrame.getType())
				.layoverAirportId(airportEventsDBFrame.getLayoverAirportId())
				.imageURL(airportEventsDBFrame.getImageURL())
				.build();
	}

}

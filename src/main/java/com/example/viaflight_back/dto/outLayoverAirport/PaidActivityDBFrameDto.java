package com.example.viaflight_back.dto.outLayoverAirport;

import com.example.viaflight_back.domain.outLayoverAirport.PaidActivityDBFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaidActivityDBFrameDto {

 	private String paidActivityName;
	private Double openTime;
	private Double closeTime;
	private Double usedTime;
	private String businessTime;
	private String information;
	private String cost;
	private String homepage;
	private String type;
	private String imageURL;
	private String layoverAirportId;

	public static PaidActivityDBFrameDto from(PaidActivityDBFrame paidActivityDBFrame) {
		return PaidActivityDBFrameDto.builder()
				.paidActivityName(paidActivityDBFrame.getPaidActivityName())
				.openTime(paidActivityDBFrame.getOpenTime())
				.closeTime(paidActivityDBFrame.getCloseTime())
				.usedTime(paidActivityDBFrame.getUsedTime())
				.businessTime(paidActivityDBFrame.getBusinessTime())
				.information(paidActivityDBFrame.getInformation())
				.cost(paidActivityDBFrame.getCost())
				.homepage(paidActivityDBFrame.getHomepage())
				.type(paidActivityDBFrame.getType())
				.imageURL(paidActivityDBFrame.getImageURL())
				.layoverAirportId(paidActivityDBFrame.getLayoverAirportId())
				.build();
	}

}

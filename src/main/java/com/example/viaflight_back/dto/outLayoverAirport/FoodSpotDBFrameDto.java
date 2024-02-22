package com.example.viaflight_back.dto.outLayoverAirport;


import com.example.viaflight_back.domain.outLayoverAirport.FoodSpotDBFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodSpotDBFrameDto {

	private String foodSpotName;
	private Double openTime;
	private Double closeTime;
	private String businessTime;
	private String information;
	private String phoneNumber;
	private String type;
	private String imageURL;
	private String layoverAirportId;

	public static FoodSpotDBFrameDto from(FoodSpotDBFrame foodSpotDBFrame){
		return FoodSpotDBFrameDto.builder()
				.foodSpotName(foodSpotDBFrame.getFoodSpotName())
				.openTime(foodSpotDBFrame.getOpenTime())
				.closeTime(foodSpotDBFrame.getCloseTime())
				.businessTime(foodSpotDBFrame.getBusinessTime())
				.information(foodSpotDBFrame.getInformation())
				.phoneNumber(foodSpotDBFrame.getPhoneNumber())
				.type(foodSpotDBFrame.getType())
				.imageURL(foodSpotDBFrame.getImageURL())
				.layoverAirportId(foodSpotDBFrame.getLayoverAirportId())
				.build();
	}

}

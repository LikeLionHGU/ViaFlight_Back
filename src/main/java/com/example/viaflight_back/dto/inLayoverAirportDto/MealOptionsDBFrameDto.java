package com.example.viaflight_back.dto.inLayoverAirportDto;

import com.example.viaflight.domain.frameAboutDB.inLayoverAirport.MealOptionsDBFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MealOptionsDBFrameDto {

	private String mealName;
	private Double openTime;
	private Double closeTime;
	private String businessHours;
	private String location;
	private String information;
	private String phoneNumber;
	private String cost;
	private String blog;
	private String type;
	private String layoverAirportId;
	private String imageURL;

	public static MealOptionsDBFrameDto from(MealOptionsDBFrame mealOptionsDBFrame) {
		return MealOptionsDBFrameDto.builder()
				.mealName(mealOptionsDBFrame.getMealName())
				.openTime(mealOptionsDBFrame.getOpenTime())
				.closeTime(mealOptionsDBFrame.getCloseTime())
				.businessHours(mealOptionsDBFrame.getBusinessHours())
				.location(mealOptionsDBFrame.getLocation())
				.information(mealOptionsDBFrame.getInformation())
				.phoneNumber(mealOptionsDBFrame.getPhoneNumber())
				.cost(mealOptionsDBFrame.getCost())
				.blog(mealOptionsDBFrame.getBlog())
				.type(mealOptionsDBFrame.getType())
				.layoverAirportId(mealOptionsDBFrame.getLayoverAirportId())
				.imageURL(mealOptionsDBFrame.getImageURL())
				.build();
	}

}

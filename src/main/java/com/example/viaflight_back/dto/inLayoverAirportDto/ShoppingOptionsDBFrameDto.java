package com.example.viaflight_back.dto.inLayoverAirportDto;

import com.example.viaflight_back.domain.inLayoverAirport.ShoppingOptionsDBFrame;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShoppingOptionsDBFrameDto {

	private String shoppingOptionsName;
	private Double openTime;
	private Double closeTime;
	private String businessHours;
	private String location;
	private String information;
	private String phoneNumber;
	private String blog;
	private String cost;
	private String type;
	private String layoverAirportId;
	private String imageURL;

	public static ShoppingOptionsDBFrameDto from(ShoppingOptionsDBFrame shoppingOptionsDBFrame) {
		return ShoppingOptionsDBFrameDto.builder()
				.shoppingOptionsName(shoppingOptionsDBFrame.getShoppingOptionsName())
				.openTime(shoppingOptionsDBFrame.getOpenTime())
				.closeTime(shoppingOptionsDBFrame.getCloseTime())
				.businessHours(shoppingOptionsDBFrame.getBusinessHours())
				.location(shoppingOptionsDBFrame.getLocation())
				.information(shoppingOptionsDBFrame.getInformation())
				.phoneNumber(shoppingOptionsDBFrame.getPhoneNumber())
				.blog(shoppingOptionsDBFrame.getBlog())
				.cost(shoppingOptionsDBFrame.getCost())
				.type(shoppingOptionsDBFrame.getType())
				.layoverAirportId(shoppingOptionsDBFrame.getLayoverAirportId())
				.imageURL(shoppingOptionsDBFrame.getImageURL())
				.build();
	}

}

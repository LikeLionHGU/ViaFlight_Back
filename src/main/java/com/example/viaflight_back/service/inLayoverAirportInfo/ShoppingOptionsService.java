package com.example.viaflight_back.service.inLayoverAirportInfo;

import java.util.List;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.dto.inLayoverAirportDto.ShoppingOptionsDBFrameDto;
import com.example.viaflight_back.repository.inLayoverAirport.ShoppingOptionsDBFrameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ShoppingOptionsService {

	private final ShoppingOptionsDBFrameRepository shoppingOptionsDBFrameRepository;

	public List<ShoppingOptionsDBFrameDto> load(LayoverAirportRequest layoverAirportRequest) {
		String layoverAirportId = layoverAirportRequest.getLayoverAirportName().substring(layoverAirportRequest.getLayoverAirportName().length()-4, layoverAirportRequest.getLayoverAirportName().length()-1);
		Double layoverArrivalTime = LayoverAirportRequest.layoverArrivalTimeToDouble(layoverAirportRequest.getLayoverArrivalTime());
		List<ShoppingOptionsDBFrameDto> mealOptionsDBFrameDtoList = shoppingOptionsDBFrameRepository.findOpenPlaces(layoverAirportId, layoverArrivalTime).stream().map(ShoppingOptionsDBFrameDto::from).toList();

		return mealOptionsDBFrameDtoList;
	}

}

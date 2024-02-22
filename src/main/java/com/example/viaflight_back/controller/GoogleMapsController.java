package com.example.viaflight_back.controller;

import com.example.viaflight_back.controller.response.GeoCodingResponse;
import com.example.viaflight_back.service.google.GoogleMapsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/google/map")
@RequiredArgsConstructor
public class GoogleMapsController {

	private final GoogleMapsService geocodingService;

	@GetMapping("/search")
//	public Mono<String> search(@RequestParam String address) {
	public Mono<GeoCodingResponse> search(@RequestParam String address) {
		return geocodingService.getLatLong(address);
	}



}


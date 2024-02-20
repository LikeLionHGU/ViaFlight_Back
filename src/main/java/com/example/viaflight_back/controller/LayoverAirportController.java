package com.example.viaflight_back.controller;

import com.example.viaflight_back.controller.request.LayoverAirportRequest;
import com.example.viaflight_back.controller.response.AllInfoAboutLayoverAirportResponse;
import com.example.viaflight_back.controller.response.LayoverAirportInResponse;
import com.example.viaflight_back.controller.response.LayoverAirportInfo;
import com.example.viaflight_back.controller.response.LayoverAirportOutResponse;
import com.example.viaflight_back.dto.airportDto.LayoverAirportDBFrameDto;
import com.example.viaflight_back.service.AllLayoverAirportInfoService;
import com.example.viaflight_back.service.InLayoverAirportInfoService;
import com.example.viaflight_back.service.OutLayoverAirportInfoService;
import com.example.viaflight_back.service.airport.LayoverAirportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class LayoverAirportController {

	private final AllLayoverAirportInfoService responseService;

	@GetMapping("/all-layover-airport")
	public ResponseEntity<AllInfoAboutLayoverAirportResponse> getAllLayoverAirportInfo
		(@RequestParam("layoverAirportName") String layoverAirportName, @RequestParam("layoverArrivalTime") String layoverArrivalTime, @RequestParam("layoverTime") String layoverTime) {

		LayoverAirportRequest layoverAirportRequest = new LayoverAirportRequest(layoverAirportName, layoverArrivalTime, layoverTime);

		AllInfoAboutLayoverAirportResponse response = responseService.load(layoverAirportRequest);
		return ResponseEntity.ok().body(response);
	}

	private final LayoverAirportService layoverAirportService;
	@GetMapping("/layover-airport")
	public ResponseEntity<LayoverAirportInfo> getLayoverAirportInfo
		(@RequestParam("layoverAirportName") String layoverAirportName, @RequestParam("layoverArrivalTime") String layoverArrivalTime, @RequestParam("layoverTime") String layoverTime) {

		LayoverAirportRequest layoverAirportRequest = new LayoverAirportRequest(layoverAirportName, layoverArrivalTime, layoverTime);

		LayoverAirportDBFrameDto response = layoverAirportService.load(layoverAirportRequest);
		return ResponseEntity.ok().body(new LayoverAirportInfo(response));
	}

	private final InLayoverAirportInfoService inLayoverAirportInfoService;
	@GetMapping("/layover-airport-in")
	public ResponseEntity<LayoverAirportInResponse> getLayoverAirportInInfo
		(@RequestParam("layoverAirportName") String layoverAirportName, @RequestParam("layoverArrivalTime") String layoverArrivalTime, @RequestParam("layoverTime") String layoverTime) {

		LayoverAirportRequest layoverAirportRequest = new LayoverAirportRequest(layoverAirportName, layoverArrivalTime, layoverTime);

		LayoverAirportInResponse response = inLayoverAirportInfoService.load(layoverAirportRequest);
		return ResponseEntity.ok().body(response);
	}

	private final OutLayoverAirportInfoService outLayoverAirportInfoService;
	@GetMapping("/layover-airport-out")
	public ResponseEntity<LayoverAirportOutResponse> getLayoverAirportOutInfo
		(@RequestParam("layoverAirportName") String layoverAirportName, @RequestParam("layoverArrivalTime") String layoverArrivalTime, @RequestParam("layoverTime") String layoverTime) {

		LayoverAirportRequest layoverAirportRequest = new LayoverAirportRequest(layoverAirportName, layoverArrivalTime, layoverTime);

		LayoverAirportOutResponse response = outLayoverAirportInfoService.load(layoverAirportRequest);
		return ResponseEntity.ok().body(response);
	}

}

package com.example.viaflight_back.domain.outLayoverAirport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "free_tour_db_frame")
public class FreeTourDBFrame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "free_tour_id", nullable = false)
	private Long freeTourId;

	@Column(name = "free_tour_name", nullable = false)
	private String freeTourName;

	@Column(name = "route", nullable = false)
	private String Route;

	@Column(name = "business_time", nullable = false)
	private String businessTime;

	@Column(name = "information", nullable = false, length = 1000)
	private String information;

	@Column(name = "cost", nullable = true)
	private String cost;

	@Column(name = "homepage", nullable = true)
	private String homepage;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true)
	private String imageURL;

	@Column(name = "layover_airport_id", nullable = false)
	private String layoverAirportId;


}

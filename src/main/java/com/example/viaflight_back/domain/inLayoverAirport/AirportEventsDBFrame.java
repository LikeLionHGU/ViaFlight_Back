package com.example.viaflight_back.domain.inLayoverAirport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "airport_events_db_frame")
public class AirportEventsDBFrame {

	// 공항 event

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "planned_events_id", nullable = false)
	private Long plannedEventsId;

	@Column(name = "event_name", nullable = false)
	private String eventName;

	@Column(name = "location", nullable = false)
	private String location;

	@Column(name = "open_time", nullable = false)
	private Double openTime;

	@Column(name = "close_time", nullable = false)
	private Double closeTime;

	@Column(name = "business_hours", nullable = false)
	private String businessHours;

	@Column(name = "information", nullable = true, length = 1000)
	private String information;

	@Column(name = "cost", nullable = true, length = 1000)
	private String cost;

	@Column(name = "reservation_url", nullable = true)
	private String reservationUrl;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true)
	private String imageURL;

	@Column(name = "layover_airport_id", nullable = false)
	private String layoverAirportId;


}

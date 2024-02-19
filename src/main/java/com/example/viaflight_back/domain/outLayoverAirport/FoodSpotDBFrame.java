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
@Table(name = "food_spot_db_frame")
public class FoodSpotDBFrame {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "food_spot_id", nullable = false)
	private Long foodSpotId;

	@Column(name = "food_spot_name", nullable = false)
	private String foodSpotName;

	@Column(name = "open_time", nullable = true)
	private Double openTime;

	@Column(name = "close_time", nullable = true)
	private Double closeTime;

	@Column(name = "business_time", nullable = false)
	private String businessTime;

	@Column(name = "information", nullable = false, length = 1000)
	private String information;

	@Column(name = "phoneNumber", nullable = true)
	private String phoneNumber;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "image_url" ,nullable = true)
	private String imageURL;

	@Column(name = "layover_airport_id", nullable = false)
	private String layoverAirportId;


}

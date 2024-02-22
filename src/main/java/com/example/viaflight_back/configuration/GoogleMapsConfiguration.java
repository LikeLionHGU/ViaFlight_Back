package com.example.viaflight_back.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.google.maps")  // yml에 있는 그거 적어주는 거!
public class GoogleMapsConfiguration {
	private String apiKey;
}

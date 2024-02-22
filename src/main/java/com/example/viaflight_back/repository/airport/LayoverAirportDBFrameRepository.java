package com.example.viaflight_back.repository.airport;

import com.example.viaflight_back.domain.airport.LayoverAirportDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface LayoverAirportDBFrameRepository extends JpaRepository<LayoverAirportDBFrame, Long>{
	Optional<LayoverAirportDBFrame> findByLayoverAirportId(String layoverAirportId);

}

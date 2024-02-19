package com.example.viaflight_back.repository.outLayoverAirport;

import com.example.viaflight_back.domain.outLayoverAirport.FreeTourDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FreeTourDBFrameRepository extends JpaRepository<FreeTourDBFrame    , Long> {
	List<FreeTourDBFrame> findByLayoverAirportId(String layoverAirportId);

}

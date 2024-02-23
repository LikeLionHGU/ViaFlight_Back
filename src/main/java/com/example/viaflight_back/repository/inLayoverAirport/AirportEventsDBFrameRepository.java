package com.example.viaflight_back.repository.inLayoverAirport;

import com.example.viaflight_back.domain.inLayoverAirport.AirportEventsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportEventsDBFrameRepository extends JpaRepository<AirportEventsDBFrame, Long>{

//	@Query("SELECT a FROM AirportEventsDBFrame a WHERE a.layoverAirportId = :layoverAirportId AND ((a.openTime <= :layoverArrivalTime AND a.closeTime >= :layoverArrivalTime) OR (a.closeTime > :layoverArrivalTime AND a.openTime > a.closeTime))")
	@Query("SELECT a FROM AirportEventsDBFrame a WHERE a.layoverAirportId = :layoverAirportId AND ((a.openTime <= :layoverArrivalTime AND a.closeTime >= :layoverArrivalTime) OR (a.openTime > a.closeTime AND ((:layoverArrivalTime >= a.openTime) OR (:layoverArrivalTime < a.closeTime))))")
	List<AirportEventsDBFrame> findOpenPlaces(@Param("layoverAirportId") String layoverAirportId, @Param("layoverArrivalTime") Double layoverArrivalTime);

}

package com.example.viaflight_back.repository.inLayoverAirport;

import com.example.viaflight_back.domain.inLayoverAirport.RestsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestsDBFrameRepository extends JpaRepository<RestsDBFrame, Long> {
	@Query("SELECT a FROM RestsDBFrame a WHERE a.layoverAirportId = :layoverAirportId AND ((a.openTime <= :layoverArrivalTime AND a.closeTime >= :layoverArrivalTime) OR (a.closeTime > :layoverArrivalTime AND a.openTime + 24 > a.closeTime AND a.openTime != a.closeTime + 24))")
	List<RestsDBFrame> findOpenPlaces(@Param("layoverAirportId") String layoverAirportId, @Param("layoverArrivalTime") Double layoverArrivalTime);

}

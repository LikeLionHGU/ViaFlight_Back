package com.example.viaflight_back.repository.inLayoverAirport;

import com.example.viaflight_back.domain.inLayoverAirport.ShoppingOptionsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingOptionsDBFrameRepository extends JpaRepository<ShoppingOptionsDBFrame, Long> {

	@Query("SELECT a FROM ShoppingOptionsDBFrame a WHERE a.layoverAirportId = :layoverAirportId AND ((a.openTime <= :layoverArrivalTime AND a.closeTime > :layoverArrivalTime) OR (a.closeTime <= :layoverArrivalTime AND a.openTime > a.closeTime AND :layoverArrivalTime < a.openTime + 24))")
	List<ShoppingOptionsDBFrame> findOpenPlaces(@Param("layoverAirportId") String layoverAirportId, @Param("layoverArrivalTime") Double layoverArrivalTime);

}

package com.example.viaflight_back.repository.outLayoverAirport;

import com.example.viaflight_back.domain.outLayoverAirport.FoodSpotDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodSpotDBFrameRepository extends JpaRepository<FoodSpotDBFrame, Long> {

}

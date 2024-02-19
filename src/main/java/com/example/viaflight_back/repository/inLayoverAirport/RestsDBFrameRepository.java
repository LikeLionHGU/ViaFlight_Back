package com.example.viaflight_back.repository.inLayoverAirport;

import com.example.viaflight_back.domain.inLayoverAirport.RestsDBFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestsDBFrameRepository extends JpaRepository<RestsDBFrame, Long> {

}

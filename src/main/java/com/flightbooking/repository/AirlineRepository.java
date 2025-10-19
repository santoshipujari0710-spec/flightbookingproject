package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightbooking.entity.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Long> {
    // Optional: methods like findByName(String name)
}

package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightbooking.entity.Airport;

public interface AirportRepository extends JpaRepository<Airport, Long> {
    // Custom queries can go here later
}

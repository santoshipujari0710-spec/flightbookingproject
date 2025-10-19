package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightbooking.entity.Passenger;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}

//package com.flightbooking.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import com.flightbooking.entity.Flight;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface FlightRepository extends JpaRepository<Flight, Long> {
//    // You can later add custom search query methods like:
//    // List<Flight> findBySourceCodeAndDestinationCode(String source, String destination);
//	
//}
package com.flightbooking.repository;

import com.flightbooking.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query("SELECT f FROM Flight f WHERE LOWER(f.source.code) = LOWER(:source) AND LOWER(f.destination.code) = LOWER(:destination)")
    List<Flight> searchFlights(@Param("source") String source, @Param("destination") String destination);
}

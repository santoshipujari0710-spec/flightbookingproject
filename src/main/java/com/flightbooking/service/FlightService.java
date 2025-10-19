////package com.flightbooking.service;
////
////import com.flightbooking.entity.Flight;
////import java.util.List;
////
////public interface FlightService {
////    List<Flight> searchFlights(String sourceCode, String destinationCode);
////}
//
//package com.flightbooking.service;
//
//import com.flightbooking.entity.Flight;
//import com.flightbooking.repository.FlightRepository;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class FlightService {
//
//    private final FlightRepository flightRepository;
//
//    public FlightService(FlightRepository flightRepository) {
//        this.flightRepository = flightRepository;
//    }
//
//    public List<Flight> searchFlights(String source, String destination) {
//        return flightRepository.searchFlights(source, destination);
//    }
//}


package com.flightbooking.service;

import com.flightbooking.entity.Flight;
import java.util.List;

public interface FlightService {
    List<Flight> searchFlights(String source, String destination);
}


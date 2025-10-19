//package com.flightbooking.service;
//
//import com.flightbooking.entity.Flight;
//import com.flightbooking.repository.FlightRepository;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class FlightServiceImpl implements FlightService {
//    private final FlightRepository flightRepository;
//
//    public FlightServiceImpl(FlightRepository flightRepository) {
//        this.flightRepository = flightRepository;
//    }
//
//    @Override
//    public List<Flight> searchFlights(String sourceCode, String destinationCode) {
//        return flightRepository.findAll();
//    }
//}

package com.flightbooking.service;

import com.flightbooking.entity.Flight;
import com.flightbooking.repository.FlightRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> searchFlights(String source, String destination) {
        return flightRepository.searchFlights(source, destination);
    }
}

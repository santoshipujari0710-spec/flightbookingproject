//package com.flightbooking.controller;
//
//import com.flightbooking.entity.Flight;
//import com.flightbooking.service.FlightService;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/flights")
//public class FlightController {
//    private final FlightService flightService;
//
//    public FlightController(FlightService flightService) {
//        this.flightService = flightService;
//    }
//
//    @GetMapping("/search")
//    public List<Flight> searchFlights(@RequestParam String source,
//                                      @RequestParam String destination) {
//        return flightService.searchFlights(source, destination);
//    }
//}


package com.flightbooking.controller;

import com.flightbooking.entity.Flight;
import com.flightbooking.service.FlightService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/search")
    public List<Flight> searchFlights(
            @RequestParam String source,
            @RequestParam String destination) {
        return flightService.searchFlights(source, destination);
    }
}

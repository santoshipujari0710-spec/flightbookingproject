/////*
//// * package com.flightbooking.entity;
//// * 
//// * import jakarta.persistence.*; import java.time.LocalDateTime;
//// * 
//// * @Entity public class Flight {
//// * 
//// * @Id
//// * 
//// * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
//// * 
//// * @ManyToOne private Airport source;
//// * 
//// * @ManyToOne private Airport destination;
//// * 
//// * @ManyToOne private Airline airline;
//// * 
//// * private LocalDateTime departureTime; private LocalDateTime arrivalTime;
//// * private double price;
//// * 
//// * // Getters and Setters // (same pattern as before) }
//// */
////
////package com.flightbooking.entity;
////
////import jakarta.persistence.*;
////import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
////import java.time.LocalDateTime;
////
////@Entity
////@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
////public class Flight {
////
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
////
////    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "source_id")
////    @JsonIgnoreProperties("hibernateLazyInitializer")
////    private Airport source;
////
////    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "destination_id")
////    @JsonIgnoreProperties("hibernateLazyInitializer")
////    private Airport destination;
////
////    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "airline_id")
////    @JsonIgnoreProperties("hibernateLazyInitializer")
////    private Airline airline;
////
////    private LocalDateTime departureTime;
////    private LocalDateTime arrivalTime;
////    private double price;
////
////    // Getters and Setters
////}
//
//package com.flightbooking.entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//


//@Entity
//public class Flight {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "source_id")
//    private Airport source;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "destination_id")
//    private Airport destination;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "airline_id")
//    private Airline airline;
//
//    private LocalDateTime departureTime;
//    private LocalDateTime arrivalTime;
//    private double price;
//
//    // Getters and Setters
//}


package com.flightbooking.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "source_id")
    private Airport source;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "destination_id")
    private Airport destination;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "airline_id")
    private Airline airline;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double price;

    // --- getters आणि setters ---
    public Long getId() { return id; }
    public Airport getSource() { return source; }
    public void setSource(Airport source) { this.source = source; }

    public Airport getDestination() { return destination; }
    public void setDestination(Airport destination) { this.destination = destination; }

    public Airline getAirline() { return airline; }
    public void setAirline(Airline airline) { this.airline = airline; }

    public LocalDateTime getDepartureTime() { return departureTime; }
    public void setDepartureTime(LocalDateTime departureTime) { this.departureTime = departureTime; }

    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(LocalDateTime arrivalTime) { this.arrivalTime = arrivalTime; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

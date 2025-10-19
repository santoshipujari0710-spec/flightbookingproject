package com.flightbooking.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Flight flight;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Passenger> passengers;

    private double totalPrice;

    // Getters and Setters
}

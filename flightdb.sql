CREATE DATABASE  flightdb;

CREATE TABLE airport (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(10) NOT NULL,
    name VARCHAR(255) NOT NULL,
    city VARCHAR(100) NOT NULL
);


CREATE TABLE airline (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);


CREATE TABLE flight (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    source_id BIGINT,
    destination_id BIGINT,
    airline_id BIGINT,
    departure_time DATETIME,
    arrival_time DATETIME,
    price DOUBLE,
    FOREIGN KEY (source_id) REFERENCES airport(id),
    FOREIGN KEY (destination_id) REFERENCES airport(id),
    FOREIGN KEY (airline_id) REFERENCES airline(id)
);

CREATE TABLE passenger (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100),
    gender VARCHAR(20),
    age INT,
    email VARCHAR(100),
    phone VARCHAR(20)
);


CREATE TABLE booking (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    flight_id BIGINT,
    total_price DOUBLE,
    FOREIGN KEY (flight_id) REFERENCES flight(id)
);


CREATE TABLE booking_passengers (
    booking_id BIGINT,
    passengers_id BIGINT,
    FOREIGN KEY (booking_id) REFERENCES booking(id),
    FOREIGN KEY (passengers_id) REFERENCES passenger(id)
);


INSERT INTO airport (code, name, city) VALUES
('BOM', 'Chhatrapati Shivaji Maharaj International Airport', 'Mumbai'),
('DEL', 'Indira Gandhi International Airport', 'Delhi'),
('BLR', 'Kempegowda International Airport', 'Bangalore'),
('HYD', 'Rajiv Gandhi International Airport', 'Hyderabad'),
('MAA', 'Chennai International Airport', 'Chennai'),
('PNQ', 'Pune International Airport', 'Pune'),
('GOI', 'Dabolim Airport', 'Goa'),
('AMD', 'Sardar Vallabhbhai Patel International Airport', 'Ahmedabad'),
('CCU', 'Netaji Subhas Chandra Bose International Airport', 'Kolkata'),
('COK', 'Cochin International Airport', 'Kochi');


INSERT INTO airline (name) VALUES
('Air India'),
('IndiGo'),
('SpiceJet'),
('Vistara'),
('Go First');


INSERT INTO flight (source_id, destination_id, airline_id, departure_time, arrival_time, price) VALUES
(1, 2, 1, '2025-10-20 09:00:00', '2025-10-20 11:00:00', 4500.00),
(1, 2, 2, '2025-10-20 13:00:00', '2025-10-20 15:00:00', 4800.00),
(2, 1, 3, '2025-10-21 07:30:00', '2025-10-21 09:30:00', 4300.00),
(3, 4, 4, '2025-10-22 06:00:00', '2025-10-22 07:15:00', 2800.00),
(4, 5, 2, '2025-10-22 10:00:00', '2025-10-22 12:30:00', 3200.00),
(5, 6, 5, '2025-10-23 14:00:00', '2025-10-23 16:00:00', 3600.00),
(6, 7, 3, '2025-10-24 08:30:00', '2025-10-24 10:00:00', 3100.00),
(7, 8, 4, '2025-10-25 09:00:00', '2025-10-25 10:30:00', 2700.00),
(8, 9, 1, '2025-10-25 17:00:00', '2025-10-25 19:30:00', 3900.00),
(9, 10, 2, '2025-10-26 06:00:00', '2025-10-26 08:15:00', 3400.00);


SELECT * FROM airport;
SELECT * FROM airline;
SELECT * FROM flight;

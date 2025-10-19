# ✈️ Flight Booking Service API

A Spring Boot–based backend application with a simple HTML frontend that allows users to search, view, and book flights.  
It also includes an SQL script to create and seed the database with sample data (airports, airlines, and flights).

---

## 🧩 Features
- Search one-way flights by **source** and **destination**
- Filter flights by **price, airline, and time**
- View flight details before booking
- Add multiple passengers with full details
- Automatically calculate total fare
- Booking confirmation with detailed passenger info
- MySQL database integration
- RESTful API tested using Postman

---

##  Tech Stack
- **Backend:** Spring Boot (v3.5.6), Java 17  
- **Database:** MySQL 8.0  
- **Frontend:** HTML, CSS, JavaScript  
- **Build Tool:** Maven  
- **API Testing:** Postman  

---

**🏗️ Setup Instructions**

# 1️⃣ Prerequisites
Make sure the following are installed on your system:
- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Spring Tool Suite 4](https://spring.io/tools)
- [MySQL Server 8.0](https://dev.mysql.com/downloads/installer/)
- [Postman](https://www.postman.com/downloads/)



#2️⃣ Database Configuration

1. Open **MySQL Workbench**
2. Run the script file from this repository:
    This will:
- Create the database `flightdb`
- Create all tables (`airport`, `airline`, `flight`, `passenger`, `booking`, `booking_passengers`)
- Insert sample data for testing


# 3️⃣ Application Configuration

In the file:This will:
- Create the database `flightdb`
- Create all tables (`airport`, `airline`, `flight`, `passenger`, `booking`, `booking_passengers`)
- Insert sample data for testing

---

# 3️⃣ Application Configuration

In the file:  src/main/resources/application.properties

Update your database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/flightdb
spring.datasource.username=root
spring.datasource.password=YourPassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

#4️⃣ Build and Run**
🖥️ Using Spring Tool Suite (STS)
Open STS → File → Import → Existing Maven Project → Select your project folder.
Wait for dependencies to download.
Run the main class: FlightbookingApplication.java
Server will start on: http://localhost:8080

5️⃣ Testing the API (Postman)
🔹 Search Flights
  GET Request:  http://localhost:8080/api/flights/search?source=BOM&destination=DEL
🔹 Create Booking
  POST Request: http://localhost:8080/api/bookings/create/1
Request Body (JSON):
            [
            {
              "fullName": "name",
              "gender": "F/M",
              "age": null,
              "email": "jbsajj@jidj",
              "phone": "***********"
            }
          ]






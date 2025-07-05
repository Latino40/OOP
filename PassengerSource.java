package com.balextransit;

import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    // Constructor taking a Company object
    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    // Method to request a pickup
    public boolean requestPickup() {
        // Create a new Passenger
        Passenger passenger = new Passenger();

        // Generate random pickup and destination locations (x, y coordinates from 0 to 100)
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));

        // Use the company to schedule a vehicle
        return company.scheduleVehicle(passenger, pickup, destination);
    }
}
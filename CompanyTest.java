package com.balextransit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {

    @Test
    public void testScheduleVehicleSuccess() {
        Company company = new Company();
        Passenger passenger = new Passenger();
        Location pickup = new Location(10, 20);
        Location destination = new Location(30, 40);

        // Assume a vehicle is available
        boolean result = company.scheduleVehicle(passenger, pickup, destination);

        assertTrue(result, "Vehicle scheduling should succeed when a vehicle is available");
    }

    @Test
    public void testScheduleVehicleFailure() {
        Company company = new Company();
        Passenger passenger = new Passenger();
        Location pickup = new Location(50, 60);
        Location destination = new Location(70, 80);

        // Simulate no vehicles available
        company.setAllVehiclesUnavailable();

        boolean result = company.scheduleVehicle(passenger, pickup, destination);

        assertFalse(result, "Vehicle scheduling should fail when no vehicles are available");
    }
}

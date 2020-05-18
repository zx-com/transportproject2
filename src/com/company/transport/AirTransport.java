package com.company.transport;

public class AirTransport extends Transport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by air");

    }

    public AirTransport() {
    }

    public AirTransport(String id) {
        super(id);
    }
}

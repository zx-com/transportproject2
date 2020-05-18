package com.company.transport;

public class LandTransport extends Transport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by land");
    }

    public LandTransport() {
    }

    public LandTransport(String id) {
        super(id);
    }
}

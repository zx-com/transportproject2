package com.company.transport;

public class MaritimeMeansOfTransport extends Transport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by sea");
    }

    public MaritimeMeansOfTransport() {
    }

    public MaritimeMeansOfTransport(String id) {
        super(id);
    }
}

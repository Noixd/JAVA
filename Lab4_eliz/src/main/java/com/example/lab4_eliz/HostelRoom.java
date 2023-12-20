package com.example.lab4_eliz;

/**
 * derived class HostelRoom
 */

class HostelRoom extends Room {
    private int numTenants;
    private double pricePerNight;

    public HostelRoom(double length, double width, double height, int numTenants, double pricePerNight) {
        super(length, width, height);
        this.numTenants = numTenants;
        this.pricePerNight = pricePerNight;
    }

    public String getInfo() {
        return "Length: " + length + " Width: " + width + " Height: " + height + "\nNum of tenants: " + numTenants + " Price per night: " + pricePerNight;
    }

    public double calculateIncomePerDay() {
        return numTenants * pricePerNight;
    }
}

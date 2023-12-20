package com.example.lab4_eliz;

/**
 * derived class OfficeRoom
 */
class OfficeRoom extends Room {
    private int numRooms;
    private double corridorArea;
    private double paintUsage;

    public OfficeRoom(double length, double width, double height, int numRooms, double corridorArea, double paintUsage) {
        super(length, width, height);
        this.numRooms = numRooms;
        this.corridorArea = corridorArea;
        this.paintUsage = paintUsage;
    }

    
    /** 
     * @return String
     */
    public String getInfo() {
        return "Length: " + length + " Width: " + width + " Height: " + height + "\nNum of rooms: " + numRooms + " Paint usage: " + paintUsage;
    }

    
    /** 
     * @return double
     */
    public double calculateCeilingPaintUsage() {
        double totalArea = (numRooms * calculateWallArea()) + (corridorArea * height);
        return totalArea * paintUsage;
    }
}

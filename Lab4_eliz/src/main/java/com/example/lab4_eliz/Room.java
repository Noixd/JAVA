package com.example.lab4_eliz;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Base class room
 */

class Room {
    protected double length;
    protected double width;
    protected double height;

    public Room(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateWallArea() {
        return (2 * length * height) + (2 * width * height);
    }

    public String getInfo() {
        return "Length: " + length + " Width: " + width + " Height: " + height;
    }
}




package com.lab4;

/*
 * Основной класс представления аудитории
 */

public class Audit {
    
    private int Num;
    private double Area;
    private double Capacity;

    public Audit (int Num, double Area) {
        this.Num = Num;
        this.Area = Area;
        this.Capacity = Math.floor(Area / 1.2);
    }

    public Audit () {
        this.Num = 0;
        this.Area = 0;
        this.Capacity = 0;
    }

    
    /** 
     * @param Num
     */
    public void setNum (int Num) {
        this.Num = Num;
    }
    
    
    /** 
     * @param Area
     */
    public void setArea (double Area) {
        this.Area = Area;
    }

    
    /** 
     * @return int
     */
    public int getNum () {
        return Num;
    }

    
    /** 
     * @return double
     */
    public double getArea () {
        return Area;
    }

    
    /** 
     * @return double
     */
    public double getCapacity () {
        return Capacity;
    }

    
    /** 
     * @return String
     */
    public String getInfo() {
        return "Audit Num: " + Num + "\n" + "Audit Area: " + Area + "\n" + "Audit Capacity: " + Capacity + "\n";
    }
    /*
     * Calc capacity
     */
    public void CapacityCalc () {
        this.Capacity =  Math.floor(Area / 1.2);
    }
}
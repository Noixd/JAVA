package com.lab4;

/*
 * Класс представления компьютерной аудитории
 */

public class Comp extends Audit {
    
    private int P;
    private int Capacity;

    public Comp (int P) {
        this.P = P;
        this.Capacity = P - 1;
    }

    public Comp () {
        this.P = 0;
        this.Capacity = 0;
    }

    
    /** 
     * @param P
     */
    public void setP (int P) {
        this.P = P;
    }
    
    
    /** 
     * @return int
     */
    public int getP () {
        return P;
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
        return "Comp num of PC: " + P + "\n" + "Comp Capacity: " + Capacity + "\n";
    }

    /*
     * Calc capacity
     */
    public void CapacityCalc () {
        this.Capacity = P - 1;
    }
    
}

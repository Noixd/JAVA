package com.example;

/*
 * Класс представления лекционной аудитории
 */

public class Lec extends Audit {
    
    private int K;
    private int Capacity;

    public Lec (int K) {
        this.K = K;
        this.Capacity = K * 2;
    }

    public Lec () {
        this.K = 0;
        this.Capacity = 0;
    }

    
    /** 
     * @param K
     */
    public void setK (int K) {
        this.K = K;
    }
    
    
    /** 
     * @return int
     */
    public int getK () {
        return K;
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
        return "Lec num of tiers: " + K + "\n" + "Lec Capacity: " + Capacity + "\n";
    }

    /*
     * Calc capacity 
     */
    public void CapacityCalc () {
        this.Capacity = K * 2;
    }
    
}

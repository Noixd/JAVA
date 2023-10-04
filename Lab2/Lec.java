package Lab2;

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

    public void setP (int K) {
        this.K = K;
    }
    
    public int getP () {
        return K;
    }

    public double getCapacity () {
        return Capacity;
    }

    public String getInfo() {
        return "Lec num of tiers: " + K + "\n" + "Lec Capacity: " + Capacity + "\n";
    }

    public void CapacityCalc () {
        this.Capacity = K * 2;
    }
    
}

package Lab2;

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

    public void setP (int P) {
        this.P = P;
    }
    
    public int getP () {
        return P;
    }

    public double getCapacity () {
        return Capacity;
    }

    public String getInfo() {
        return "Comp num of PC: " + P + "\n" + "Comp Capacity: " + Capacity + "\n";
    }

    public void CapacityCalc () {
        this.Capacity = P - 1;
    }
    
}

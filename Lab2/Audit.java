package Lab2;

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

    public void setNum (int Num) {
        this.Num = Num;
    }
    
    public void setArea (double Area) {
        this.Area = Area;
    }

    public int getNum () {
        return Num;
    }

    public double getArea () {
        return Area;
    }

    public double getCapacity () {
        return Capacity;
    }

    public String getInfo() {
        return "Audit Num: " + Num + "\n" + "Audit Area: " + Area + "\n" + "Audit Capacity: " + Capacity + "\n";
    }

    public void CapacityCalc () {
        this.Capacity =  Math.floor(Area / 1.2);
    }
}
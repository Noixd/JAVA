package Lab5_eliz;

public class Street_count {
    
    private String street;
    private int mark_98;
    private int mark_95;
    private int mark_92;

    public Street_count (String street) {
        this.street = street;
        this.mark_98 = 0;
        this.mark_95 = 0;
        this.mark_92 = 0;
    }

    public String getSrt() {
        return street;
    }

    public void add98() {
        this.mark_98++;
    }

    public void add95() {
        this.mark_95++;
    }

        public void add92() {
        this.mark_92++;
    }

    public String getStreetOil() {
        return "Street: " + street + " 98: " + mark_98 + " 95: " + mark_95 + " 92: " + mark_92; 
    }
}

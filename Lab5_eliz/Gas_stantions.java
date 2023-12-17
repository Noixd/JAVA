package Lab5_eliz;

public class Gas_stantions {

    private int oil_mark;
    private String company;
    private int price;
    private String street;

    public Gas_stantions (String company, int oil_mark, int price, String street) {
        this.company = company;
        this.oil_mark = oil_mark;
        this.price = price;
        this.street = street;
    }

    public Gas_stantions () {
        this.company = null;
        this.oil_mark = 0;
        this.price = 0;
        this.street = null;
    }

    public String getInfo () {
        return "Street: " + street + " Price: " + price + " Company: " + company + " Oil mark: " + oil_mark + "\n";
    }

    public int getOil () {
        return oil_mark;
    }

    public String getStreet () {
        return street;
    }
}

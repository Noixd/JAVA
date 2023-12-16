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
        return "Oil mark: " + oil_mark + " Price: " + price + " Company: " + company + " Street: " + street + "\n";
    }

    public int getOil () {
        return oil_mark;
    }

    public int getPrice () {
        return price;
    }
}

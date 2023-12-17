package Lab5_eliz;

import java.util.ArrayList;

public class App {

    public static ArrayList <Gas_stantions> aList = new ArrayList<Gas_stantions>();
    public static ArrayList <Street_count> sCount = new ArrayList<Street_count>();
    
    public static void main( String args[] ) {
        
        Gas_stantions st1 = new Gas_stantions("BelNeft", 98, 244, "Soviet");
        Gas_stantions st2 = new Gas_stantions("GasProm", 95, 233, "Pushkina");
        Gas_stantions st3 = new Gas_stantions("LukOil", 92, 200, "Goncharova");
        aList.add(st1);
        aList.add(st2);
        aList.add(st3);
        aList.add(new Gas_stantions("bbb", 98, 255, "Soviet"));
        aList.add(new Gas_stantions("bbb", 95, 300, "Pushkina"));
        aList.add(new Gas_stantions("bbb", 92, 457, "Goncharova"));

        aList.sort((o1, o2) -> o1.getInfo().compareTo(o2.getInfo()));

        int i = 0;

        while (aList.size() > i) {
            System.out.println(aList.get(i).getInfo());
            i++;
        }    

        i = 0;
        sCount.add(new Street_count(aList.get(i).getStreet()));
        String street = aList.get(0).getStreet();
        while (aList.size() > i) {
            if (street != aList.get(i).getStreet()) {
                street = aList.get(i).getStreet();
                sCount.add(new Street_count(aList.get(i).getStreet()));
            }
            i++;
        }
        
        int j = 0;
        while (sCount.size() > j) {
            i = 0;
            while (aList.size() > i) {
                
            if (sCount.get(j).getSrt() == aList.get(i).getStreet()) {
                switch (aList.get(i).getOil()) {
                    case 98:
                        sCount.get(j).add98();
                        break;
                    case 95:
                        sCount.get(j).add95();
                        break;
                    case 92:
                        sCount.get(j).add92();
                        break;
                    }
                }
                i++;
            }
        System.out.println(sCount.get(j).getStreetOil());
        j++;
        }
    }
}
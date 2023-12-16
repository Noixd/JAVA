import java.util.ArrayList;
//import java.util.Comparator;


public class App {

    public static ArrayList <Gas_stantions> aList = new ArrayList<Gas_stantions>();
    
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

        aList.sort((o1, o2) -> o2.getInfo().compareTo(o1.getInfo()));

        int i = 0;
        System.out.println("Oil mark: 98 \n");
        while (aList.size() > i) {
            if (aList.get(i).getOil() == 98) System.out.println(aList.get(i).getPrice() + "\n");
            i++;
        }
        
        i = 0;
        System.out.println("Oil mark: 95 \n");
        while (aList.size() > i) {
            if (aList.get(i).getOil() == 95) System.out.println(aList.get(i).getPrice() + "\n");
            i++;
        }

        i = 0;
        System.out.println("Oil mark: 92 \n");
        while (aList.size() > i) {
            if (aList.get(i).getOil() == 92) System.out.println(aList.get(i).getPrice() + "\n");
            i++;
        }

        i = 0;
        System.out.println("Info: \n");
        while (aList.size() > i) {
            System.out.println(aList.get(i).getInfo() + "\n");
            i++;
        }
        
    }
}

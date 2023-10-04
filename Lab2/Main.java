package Lab2;

import java.util.Scanner;

public class Main {

    public static void main( String args[] ) {

        Scanner in = new Scanner(System.in);
        Audit cab1 = new Audit(234, 45.45);
        Audit cab2 = new Audit();
        Audit cab3 = new Audit();

        cab2.setNum(555);
        cab2.setArea(23);
        cab2.CapacityCalc();

        System.out.println(cab1.getInfo());
        System.out.println(cab2.getInfo());

        System.out.print("Input Num: ");
        cab3.setNum(in.nextInt());

        System.out.print("Input area: ");
        cab3.setArea(in.nextDouble());

        cab3.CapacityCalc();

        System.out.println("Info\n" + cab3.getInfo());

        Lec cabLec = new Lec();
        Comp cabComp = new Comp();


        System.out.print("Input K: ");
        cabLec.setK(in.nextInt());

        cabLec.CapacityCalc();

        System.out.println("Info\n" + cabLec.getInfo());

        System.out.print("Input P: ");
        cabComp.setP(in.nextInt());

        cabComp.CapacityCalc();

        System.out.println("Info\n" + cabComp.getInfo());
        
    }
}

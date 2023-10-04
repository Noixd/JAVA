package Lab1;
import java.util.Scanner;

public class Task1 {
    public static void main (){

        double y, n, rez;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a 1 number: ");
        y = in.nextDouble();
    

        System.out.print("Input a 2 number: ");
        n = in.nextDouble();
        in.close();

        rez = Math.pow(y, 2) + 0.5 * n + 4.8 / Math.sin (y);

        System.out.println("Лабораторная работа № 1. Задание № 1.");
        System.out.println("Исходные данные:");
        System.out.printf("a=%.2f b=%.2f \n",y,n);
        System.out.printf("Результат вычисления выражения: %.2f",rez);
    }
}

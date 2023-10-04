package Lab1;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main (String[] args) {
        
        double mass [] = new double[10], val, min, max;
        Random rand = new Random();

        System.out.println("Лабораторная работа № 1. Задание № 3.");
        System.out.println("Исходный массив");

        for (int i = 0; i < 10; i++) {
            val = rand.nextDouble();
            mass[i] = val * 50; 
            System.out.println(mass[i]);
        }

        max = Arrays.stream(mass).max().getAsDouble();
        min = Arrays.stream(mass).min().getAsDouble();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        if (max - min < 25) System.out.println("a) True");
            else System.out.println("a) False");

        if (max/2 > min) System.out.println("b) True");
            else System.out.println("b) False");
    }
}
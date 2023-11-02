package Lab3;

import java.util.Scanner;

public class Task2 {
    
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String path = in.nextLine();
        
        int i = 0;

        System.out.print("Input n-char: ");
        String n_raw = in.nextLine();
        while (n_raw.length() > 1 || n_raw.length() == 0) {
            System.out.println("Incorrect! Try again!");
            n_raw = in.nextLine();
        }
        in.close();
        
        String[] strings = path.split(n_raw);
        for (i = 0; i < strings.length; i++) {
            strings[i] = " " + strings[i];
        }
        
        path = String.join(n_raw, strings);
        System.out.println(path.trim());
        System.out.println("Amount of words: " + i);
        }
    }

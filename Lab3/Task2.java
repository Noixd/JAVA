package Lab3;

import java.util.Scanner;

public class Task2 {
    
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String path = in.nextLine();
        char[] word = path.toCharArray();
        int i = 0;

        System.out.print("Input n-char: ");
        String n_raw = in.nextLine();
        while (n_raw.length() > 1 || n_raw.length() == 0) {
            System.out.println("Incorrect! Try again!");
            n_raw = in.nextLine();
        }
        char n = n_raw.charAt(0);
        in.close();
        
        while (i < word.length) {
            if(word[i] == n) {
                
            }
        }

    }
}

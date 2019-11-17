package task3;

import java.util.Arrays;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string:");
        String inString = scan.nextLine();
        scan.close();

        String[] words = inString.split(" ");
        System.out.println("Count words = " + words.length);
        Arrays.sort(words);
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            System.out.print(words[i] + " ");
        }
        System.out.println("");

    }
}

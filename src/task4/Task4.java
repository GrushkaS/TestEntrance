package task4;

import java.util.Scanner;

public class Task4 {

    public static int wordCount(String inString, String word){
        int i = inString.indexOf(word);
        int count = 0;
        while (i >= 0){
            count++;
            i = inString.indexOf(word,i+word.length());
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string:");
        String inString = scan.nextLine();
        System.out.println("Input word:");
        String inWord = scan.nextLine();
        scan.close();
        System.out.println("Count words = " + wordCount(inString,inWord));
    }

}

package task5;

import java.util.Scanner;

public class Task5 {

    public static boolean palindromeCheck(int a){
        int b = a;
        int c = 0;
        while(b > 0){
            c = c*10 + b%10;
            b = b/10;
        }
        if(c==a) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input N:");
        int n;
        if(!scan.hasNextInt()){System.out.println("You did not enter the integer!"); return;}
        else n = scan.nextInt();
        scan.close();
        if(n > 100){System.out.println("Out of range"); return;}
        int count = 0;
        for(int i =0; i <= n; i++)
            if(palindromeCheck(i)) count++;
        System.out.println("There are " + count + " palindromes");
        //System.out.print(palindromeCheck(12));

    }
}

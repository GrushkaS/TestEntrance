package task2;

import java.util.Scanner;

public class Task2 {


    public static int gcd(int a, int b){
        if(b == 0) return a;
        int c = a%b;
        return gcd(b,c);
    }
    public static int lcm(int a, int b){
        return a/gcd(a,b) * b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number:");
        int[] a = new int[2];
        for(int i = 0; i < 2; i++){
        if(!scan.hasNextInt()){System.out.println("You did not enter the integer!"); return;}
        else{a[i] = scan.nextInt();}
        }
        scan.close();
        System.out.print("GCD = ");
        System.out.println(gcd(a[0],a[1]));
        System.out.print("LCM = ");
        System.out.println(lcm(a[0],a[1]));
    }
}

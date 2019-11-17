package task1;

import java.util.Scanner;

public class Task1 {

    public static String evenCheck(int a){
        return a % 2 ==0 ? "Even" : "Odd";
    }

    public static String primeCheck(int a){
        if(a < 2) return "Not Prime";

        for(int i = 2; i*i <= a; i++){
            if(a%i == 0) return "Composite";
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number:");
        int a;
        if(!scan.hasNextInt()){System.out.println("You did not enter the integer!"); return;}
        else a = scan.nextInt();
        scan.close();
        System.out.println(evenCheck(a));
        System.out.println(primeCheck(a));
    }
}

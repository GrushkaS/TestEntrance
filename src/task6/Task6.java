package task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input max Weight of backpack:");
        int w;
        if(!scan.hasNextInt()){System.out.println("You did not enter the integer!"); return;}
        else w = scan.nextInt();
        Backpack backpack = new Backpack(w);
        int a =0;
        int coast = 0;
             do{
                System.out.println("\n\n\n\n\n\n\n\n");
                System.out.println("Current weight of backpack = " + backpack.getWeight() + "\nCurrent coast = " + coast);
                System.out.println(backpack.getWeightLeft() + " free weight");
                System.out.println("1) Add item to backpack");
                //System.out.println("7) Exit");
                a = scan.nextInt();
                switch (a) {
                    case (1):
                        System.out.println("Input weight of item");
                        int weight = scan.nextInt();
                        System.out.println("Input cost");
                        int cost = scan.nextInt();
                        Item i = new Item(weight, cost);
                        backpack.setWeight(i.getWeight());
                        coast += i.getCost();
                        break;
                    default:
                        break;
                }
            }while (!backpack.isFull());
        System.out.println("Backpack is full!");
        System.out.println("Weight of backpack = " + backpack.getWeight() + " Coast = " + coast);
        }

    }

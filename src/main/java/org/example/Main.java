package org.example;

import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Data.setStart(true);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Welcome to KB stopWatch.....!");
        System.out.println("-----------------------------------------------------------------------------");
        while(Data.isStart()){
            Calculation calculation = new Calculation(scanner);
            System.out.print("\n1 to Start\n2 to exit\nEnter the choice : ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("helo");
                         calculation.start();
                         break;
                case 2 : Data.setStart(false);
                         break;
                default:
                    System.out.println("One not recognize...!");
            }

        }
        scanner.close();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Thanks for using KB StopWatch....!");
        System.out.println("-----------------------------------------------------------------------------");
    }
}
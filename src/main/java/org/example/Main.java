package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Data.setStart(true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Welcome to KB stopWatch.....!");
        System.out.println("-----------------------------------------------------------------------------");
        while(Data.isStart()){
            System.out.print("\n1 to Start\n2 to exit\nEnter the choice : ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1 : Data.setStartTime(System.currentTimeMillis());
                         Calculation.start();
                         break;
                case 2 : Data.setStart(false);
                         break;
            }
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Thanks for using KB StopWatch....!");
        System.out.println("-----------------------------------------------------------------------------");
    }
}
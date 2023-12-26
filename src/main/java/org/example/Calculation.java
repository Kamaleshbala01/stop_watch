package org.example;

import java.util.Scanner;

public class Calculation {
    static Scanner scanner = new Scanner(System.in);
    static  boolean flag = true;
       public static void start(){
           int count = 0;
           while(flag){
               System.out.print("\n1 for lap\n2 for pause\n3 for exit\nEnter your choice : ");
               int choice = scanner.nextInt();
               switch (choice){
                   case 1:
                           System.out.println("lap : "+count++);
                           Data.setEndTime(System.currentTimeMillis());
                           Data.setMilliseconds(Data.getMilliseconds()+Data.getEndTime()-Data.getStartTime());
                           getCalculation();
                           Data.setStartTime(System.currentTimeMillis());
                           break;
                   case 2: System.out.println("\nYou Paused the stop Watch.....!");
                           Data.setEndTime(System.currentTimeMillis());
                           Data.setMilliseconds(Data.getMilliseconds()+Data.getEndTime()-Data.getStartTime());
                           getCalculation();
                           pause();
                           break;
                   case 3: flag = false;
                           Data.setStart(false);
                           break;
               }
           }
       }
       public static void pause(){
           while(flag) {
               System.out.print("1 for resume\n2 for Reset\n3 for exit\nEnter your choice : ");
               int choice = scanner.nextInt();
               switch (choice){
                   case 1: System.out.println("\nYou Resume the stop watch ....!");
                           Data.setStartTime(System.currentTimeMillis());
                           start();
                           break;
                   case 2: System.out.println("\nYou Reset the Stop Watch....!");
                           Data.setMilliseconds(0);
                           flag = false;
                           break;
                   case 3: flag = false;
                           Data.setStart(false);
                           break;
               }
           }
       }
       public static void getCalculation(){
           long milliseconds = Data.getMilliseconds();
           long hours = milliseconds/(60*60*1000);
           long minutes =  (milliseconds%(60*60*1000))/(1000*60);
           long seconds =  (milliseconds%(1000*60))/1000;
           System.out.println("-----------------------------------------------------------------------------");
           System.out.println(hours+" : "+minutes+" : "+seconds+" : "+ milliseconds%1000);
           System.out.println("-----------------------------------------------------------------------------");
       }
}

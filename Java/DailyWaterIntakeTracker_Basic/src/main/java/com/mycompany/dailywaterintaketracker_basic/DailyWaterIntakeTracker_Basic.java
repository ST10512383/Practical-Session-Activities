package com.mycompany.dailywaterintaketracker_basic;

import java.util.Scanner;

public class DailyWaterIntakeTracker_Basic {

    public static final Scanner input = new Scanner(System.in);
    
    public static double morning = 0;
    public static double afternoon = 0;
    public static double evening = 0;
    static double totalAmount = 0;
    
    public static void main(String[] args) {
        getInput();
        calculateTotal();
        displayResult();
    }
    
    public static void getInput(){
        System.out.print("Enter glasses of water in the morning: ");
        morning = input.nextDouble();
        
        System.out.print("Enter glasses of water in the afternoon: ");
        afternoon = input.nextDouble();
        
        System.out.print("Enter glasses of water in the evening: ");
        evening = input.nextDouble();
    }
    
    public static void calculateTotal(){
        totalAmount = morning + afternoon + evening;
    }
    
    public static void displayResult(){
        System.out.println("Total glasses consumed today: " + totalAmount);
    }
}

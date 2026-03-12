package com.mycompany.dailywaterintaketracker_basic;

import java.util.Scanner;

public class DailyWaterIntakeTracker_Basic {

    private static final Scanner input = new Scanner(System.in);
    
    private static double morning = 0;
    private static double afternoon = 0;
    private static double evening = 0;
    
    public static void main(String[] args) {
        getInput();
    }
    
    private static void getInput(){
        System.out.print("Enter glasses of water in the morning: ");
        morning = input.nextDouble();
        
        System.out.print("Enter glasses of water in the afternoon: ");
        afternoon = input.nextDouble();
        
        System.out.print("Enter glasses of water in the evening: ");
        evening = input.nextDouble();
    }
    
    public static void calculateTotal(){
        
    }
    
    public static void displayResult(){
        
    }
}

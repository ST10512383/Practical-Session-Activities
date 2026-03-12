package com.mycompany.dailywaterintaketracker_basic;

import java.util.Scanner;

public class DailyWaterIntakeTracker_Basic {

    private static final Scanner input = new Scanner(System.in);
    
    private double morning = 0;
    private double afternoon = 0;
    private double evening = 0;
    
    public static void main(String[] args) {
        
        
        
    }
    
    private void getInput(){
        System.out.println("Enter glasses of water in the morning: ");
        morning = input.nextDouble();
        
        System.out.println("Enter glasses of water in the afternoon");
        afternoon = input.nextDouble();
        
        System.out.println("Enter glasses of water in the evening");
        evening = input.nextDouble();
    }
    
    public void calculateTotal(){
        
    }
    
    public void displayResult(){
        
    }
}

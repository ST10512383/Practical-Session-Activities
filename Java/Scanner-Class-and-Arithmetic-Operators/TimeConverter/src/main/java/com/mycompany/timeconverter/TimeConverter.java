package com.mycompany.timeconverter;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter hours");
        // Ask user to input hours
        int hours = userInput.nextInt();
        
        // Multiply hours and assign them to their own variable
        int minutes = hours * 60;
        long seconds = hours * 3600L;
        
        // Print minutes and seconds
        System.out.println("Your hours in minutes " + minutes + "\n" + "Your hours in seconds " + seconds);
        
        // Close input
        userInput.close();
    }
}

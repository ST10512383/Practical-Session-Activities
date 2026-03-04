package com.mycompany.bmicalculator;

// Import Scanner
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Ask user to input their weight
        System.out.println("What is your weight in Kg?");
        // Assign weight to variable
        int weight = userInput.nextInt();
        
        // Ask user to input their height
        System.out.println("What is your height in meters?");
        // Assing height to variable
        double height = userInput.nextDouble();
        
        // Calculate bodyMassIndex
        double bodyMassIndex = weight / (height * height);
        
        // Print users BMI
        System.out.println("Your BMI is: " + bodyMassIndex);
    }
}

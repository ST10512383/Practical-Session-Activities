package com.mycompany.bmicalculator;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is your weight in Kg?");
        int weight = userInput.nextInt();
        
        System.out.println("What is your height in meters?");
        double height = userInput.nextDouble();
    }
}

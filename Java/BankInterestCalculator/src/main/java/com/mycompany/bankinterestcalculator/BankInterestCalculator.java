package com.mycompany.bankinterestcalculator;

import java.util.Scanner;

public class BankInterestCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter your Principal Amount");
        int principalAmount = userInput.nextInt();
        
        System.out.println("Enter your Interest Rate");
        double interestRate = userInput.nextInt();
        
        System.out.println("Enter your Intrest Years");
        int totalInterestYears = userInput.nextInt();
    }
}

package com.mycompany.bankinterestcalculator;

import java.util.Scanner;

public class BankInterestCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Ask user to enter Principal Amount
        System.out.println("Enter your Principal Amount");
        int principalAmount = userInput.nextInt();
        
        // Ask user to enter Interest Rate
        System.out.println("Enter your Interest Rate");
        int interestRate = userInput.nextInt();
        
        // Ask user to enter total interest years
        System.out.println("Enter your Interest Years");
        int totalInterestYears = userInput.nextInt();
        
        // Calculate interest rates and assing it to a variable
        int totalInterest = (principalAmount * interestRate * totalInterestYears) / 100;
        
        // Print users total interest rate
        System.out.println("Your total interest over " + totalInterestYears + " years " + " is R" + totalInterest);
        
        // Close scanner
        userInput.close();
    }
}

package com.mycompany.currencyconverter;

// Import Java Scanner package
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Asks user total amount they want to convert
        System.out.println("Enter total amount you want to convert");
        
        // Assigns user input to a variable
        double amountInUSD = userInput.nextDouble();
        
        // Multiply and assign to a new var for each currency
        double amountInEUR = amountInUSD * 0.92;
        double amountInGBP = amountInUSD * 0.75;
        
        // Converts USD to EUR and GBP. Use escape sequence to print each value on a new line
        System.out.println("Your amount in USD " + amountInUSD + "\n" + "Converted to EUR " + amountInEUR + "\n" + "Converted to GBP " + amountInGBP);
    }
}

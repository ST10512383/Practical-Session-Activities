package com.mycompany.shopchangecalculator;

// Import Scanner package
import java.util.Scanner;

public class ShopChangeCalculator {
    
    // Instantiate Scanner object
    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Invoke getItemPrice method
       double itemPrice =  getItemPrice();
        
        // Invoke getAmountPaid
        double amountPaid = getAmountPaid();
        
       double change = calculateChange(itemPrice, amountPaid);
       
       displayChange(change);
    }
    
    public static double getItemPrice() {
        // Prompt user to enter item price
        System.out.print("Item Price: ");
        
        // Declare itemPrice and assign user input back to variable
        double itemPrice = userInput.nextDouble();
        
        // Return variable itemPrice
        return itemPrice;
    }
    
    public static double getAmountPaid() {
        // Prompt user to enter the amount paid by the customer
        System.out.println("Amount paid by customer: ");
        
        // Declare amountPaid and assing user input back to variable
        double amountPaid = userInput.nextDouble();
        
        // Return variable amountPaid
        return amountPaid;
    }
    
    public static double calculateChange(double price, double paid) {
        double change = price - paid;
        
        if (paid < price) {
            System.out.println("Customer did not give full amoun2t!");
        }
        return change;
    }
    
    public static void displayChange(double change) {
        
    }
}

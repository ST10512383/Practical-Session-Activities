package com.mycompany.shopchangecalculator;

// Import Scanner package
import java.util.Scanner;

public class ShopChangeCalculator {
    
    // Instantiate Scanner object
    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Invoke getItemPrice method
       double itemPrice =  getItemPrice();
       
       double finalPrice =  calculateVat(itemPrice);
       
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
        System.out.print("Amount paid by customer: ");
        
        // Declare amountPaid and assing user input back to variable
        double amountPaid = userInput.nextDouble();
        
        // Return variable amountPaid
        return amountPaid;
    }
    
    public static double calculateChange(double price, double paid) {
        
        // Declare variable change
        double change = 0.0;
        
        // Calculate price to always be a positive value
        if (paid > price) {
            change = paid - price;
        } else if (paid < price) {
            change = price - paid;
        }
        
        // Error check to see if customer gave the full item amount
        if (paid < price) {
            System.out.println("Customer did not give full amount!");
        }
        
        return change;
    }
    
    public static double calculateVat(double totalPrice) {
        double VAT = totalPrice * 0.15;
        double finalPrice = totalPrice + VAT;
        
        System.out.println("Total before VAT: R" + totalPrice);
        System.out.println("VAT (15%): R" + VAT);
        System.out.println("Final Price: R" + finalPrice);
        
        System.out.println("");
        
        return finalPrice;
    }
        // Display change to customer
        System.out.println("Change: R" + change);
    }
}

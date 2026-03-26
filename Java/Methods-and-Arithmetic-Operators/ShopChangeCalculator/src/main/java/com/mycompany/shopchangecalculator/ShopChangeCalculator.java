package com.mycompany.shopchangecalculator;

// Import Scanner package
import java.util.Scanner;

public class ShopChangeCalculator {
    
    // Instantiate Scanner object
    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        getItemPrice();
    }
    
    public static double getItemPrice() {
        System.out.print("Item Price: ");
        double itemPrice = userInput.nextDouble();
        return itemPrice;
    }
    
    public static double getAmountPaid() {
        System.out.println("Amount paid by customer: ");   
        double amountPaid = userInput.nextDouble();
        return amountPaid;
    }
}

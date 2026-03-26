package com.mycompany.shopchangecalculator;

// Import Scanner package
import java.util.Scanner;

public class ShopChangeCalculator {
    
    // Instantiate Scanner object
    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        getItemPrice();
    }
    
    public static void getItemPrice() {
        System.out.print("Item Price: ");
        double itemPrice = userInput.nextDouble();
    }
    
}

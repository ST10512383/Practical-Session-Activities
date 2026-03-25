package com.mycompany.restaurantbillcalculator;

// Import Scanner
import java.util.Scanner;

public class RestaurantBillCalculator {

    public static void main(String[] args) {
        
        // Instantiate Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Ask the user for their meal, drink and dessert price
        System.out.print("Enter your meal price: R");
        double meal = userInput.nextDouble();
        
        System.out.print("Enter your drink price: R");
        double drink = userInput.nextDouble();
        
        System.out.print("Enter your dessert price: R");
        double dessert = userInput.nextDouble();
        
        // Invoke calculateTotal and pass variables to method
        calculateTotal(meal, drink, dessert);
        
    }
    
    public static void calculateTotal(double mealPrice, double drinkPrice, double dessertPrice) {
        // Calculate and assign back to variable
        double totalBill = mealPrice + drinkPrice + dessertPrice;
        
    }
}

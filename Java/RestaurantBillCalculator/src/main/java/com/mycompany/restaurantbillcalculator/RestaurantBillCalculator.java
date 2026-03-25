package com.mycompany.restaurantbillcalculator;

// Import Scanner
import java.util.Scanner;

public class RestaurantBillCalculator {

    public static void main(String[] args) {
        
        // Instantiate Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Ask the user for their meal, drink and dessert price
        System.out.print("Enter your meal price: ");
        double meal = userInput.nextDouble();
        
        System.out.println("Enter your drink price: ");
        double drink = userInput.nextDouble();
        
        System.out.println("Enter your dessert price: ");
        double dessert = userInput.nextDouble();
        
    }
    
    public static void calculateTotal(double mealPrice, double drinkPrice, double dessertPrice) {
        
    }
}

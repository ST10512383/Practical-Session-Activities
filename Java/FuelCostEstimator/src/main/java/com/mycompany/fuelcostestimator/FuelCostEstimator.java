package com.mycompany.fuelcostestimator;

// Import Scanner package
import java.util.Scanner;

public class FuelCostEstimator {

    public static void main(String[] args) {
        
        // Instantiate Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Prompt the user for information
        System.out.print("Enter distance: ");
        double totalDistance = userInput.nextDouble();
        
        System.out.print("Enter fuel consumption (km per litre): ");
        double kmPerLitre = userInput.nextDouble();
        
        System.out.print("Enter fuel price per litre: ");
        double pricePerLitre = userInput.nextDouble();
        
    }
    }
}

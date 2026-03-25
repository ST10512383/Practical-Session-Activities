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
        
        // Declare fuelNeeded and Invoke calculateFuelNeeded method
        double fuelNeeded = calculateFuelNeeded(totalDistance, kmPerLitre);
        
        // Declare tripCost and invoke calculateTripCost method
        double tripCost = calculateTripCost(fuelNeeded, pricePerLitre);
    }
    
    // Calculate the fuel needed and return it back to main
    public static double calculateFuelNeeded(double distance, double consumption) {
        double fuelNeeded  = distance / consumption;
        return fuelNeeded;
    }
    
    public static void calculateTripCost(double litresNeeded, double fuelPrice) {
        
    }
    
}

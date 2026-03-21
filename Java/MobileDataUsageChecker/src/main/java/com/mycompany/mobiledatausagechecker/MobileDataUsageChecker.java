package com.mycompany.mobiledatausagechecker;

// Import JOptionPane
import javax.swing.JOptionPane;

public class MobileDataUsageChecker {

    // Declare a constant to hold a data limit
    final static double DATA_LIMIT = 10.0;
    
    public static void main(String[] args) {
        // invoke startApp method
        startApp();
    }
    
    public static void startApp(){
        
        // Prompt the user for data used
        double usedData = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of data used in GB"));
        
        // Invoke calculateRemaining and pass usedData as a variable
        calculateRemaining(usedData);
    }
    
    public static void calculateRemaining(double used) {
        
        // Declare remainingData variable and calculate the remaining data that the user has left
        double remainingData = DATA_LIMIT - used;
        
    }
    public static boolean isExceeded(double used){
    }
}

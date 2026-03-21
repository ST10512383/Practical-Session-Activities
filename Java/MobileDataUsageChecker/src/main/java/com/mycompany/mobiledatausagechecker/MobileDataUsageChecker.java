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
        
        // Declare isExceeded variable and store isExceeded method return to that variable
        boolean isExceeded = isExceeded(used);
        
        // Show the user their remaining data and if their limit has been exceeded
        if (isExceeded == false) {
            JOptionPane.showMessageDialog(null, "You have " + remainingData + "GB left. Your limit has not been exeeded");
        } else if (isExceeded == true) {
            JOptionPane.showMessageDialog(null, "You have " + remainingData + "GB left. Your limit has been exeeded");
        }
    }
    
    public static boolean isExceeded(double used){
        // Check if used data is bigger than their data limit
        return used > DATA_LIMIT;
    }
}

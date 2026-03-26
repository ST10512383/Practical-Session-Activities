package com.mycompany.monthlybudgetchecker;

// Import JOptionPane package
import javax.swing.JOptionPane;

public class MonthlyBudgetChecker {

    public static void main(String[] args) {
        
        // Ask the user their expenses through the use of JOptionPane
        double monthlyAllowance = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your monthly allowance"));
        double foodExpenses = Double.parseDouble(JOptionPane.showInputDialog(null, "What are your food expenses?"));
        double transportExpenses = Double.parseDouble(JOptionPane.showInputDialog(null, "What are your transport expenses?"));
        double entertainmentExpenses = Double.parseDouble(JOptionPane.showInputDialog(null, "What are your entertainment expenses?"));
        
    }
    
    public static double calculateExpenses(double food, double transport, double entertainment) {
     
        return 0;
    }
}

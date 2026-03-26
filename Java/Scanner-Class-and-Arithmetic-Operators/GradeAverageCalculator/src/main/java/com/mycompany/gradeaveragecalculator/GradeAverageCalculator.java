package com.mycompany.gradeaveragecalculator;

// Import scanner package
import java.util.Scanner;

public class GradeAverageCalculator {

    public static void main(String[] args) {
        
        // Assign scanner object to a variable to call later
        Scanner userInput = new Scanner(System.in);
        
        // Give context to the user
        System.out.println("Let's calculate the average of three subjects!");
        
        // Ask the user to enter their grades
        System.out.println("Enter your first subjects grade");
        // Prompt the user and assign the data back to a var of type int
        int subjectOne = userInput.nextInt();
        
        System.out.println("Enter your second subjects grade");
        int subjectTwo = userInput.nextInt();
        
        System.out.println("Enther your third subjects grade");
        int subjectThree = userInput.nextInt();
        
        // Sum all three grades, divide by 3 and assign the data back to averageGrade
        int averageGrade = (subjectOne + subjectTwo + subjectThree) / 3;
        
        // Print the users averageGrade
        System.out.println("Your average grade is: " + averageGrade);
    }
}

package tek.week_8.day_4;

import java.util.Scanner;

public class Activity {
	
	// Write a java program that is going to take two user inputs.
	// num1 , num2
	// Create a static method is called calculateDivide() that is
	// accepting two double parameters.
	// return the division of num1 and num2
	
	// In the main method call calculateDivide() method and pass the 
	// numbers that are entered by the user and display the result.
	
	// Capture and handle the unchecked exception in this program.
	// do if the user divides a number by zero, your program should not
	// stop the execution.
	
	public static void main(String[] args) {
		try {
		double numOne, numTwo;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		numOne = input.nextDouble();
		System.out.print("Enter your second number: ");
		numTwo = input.nextDouble();
		
		System.err.println("Result: " + (numOne / numTwo));
		System.out.println(1/0);
		} catch(ArithmeticException e) {
			System.out.println("Faced with Exception: " + e.getMessage());
		}
	}
	
	public static double calculateDivide(double numOne, double numTwo) {
		return numOne / numTwo;
	}
}
	
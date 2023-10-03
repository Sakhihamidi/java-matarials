package tek.week_8.day_2;

import java.util.Scanner;

public class PracticingMethodOverloading {
	// Create two methods with the name subtract
	// Create two different forms of this method
	
	// in the main method, call these two methods and print the value.
	
	// Create this menu
	
	// * * * * * * * * * * * Simple Calculator * * * * * * * * * * *
	// 1. Sum
	// 2. Subtract
	// * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
	// Your Input: XXXX
	
	public static void main(String[] args) {
		int userChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("* * * * * * * * * * * Simple Calculator * * * * * * * * * * *");
		System.out.println("1. Sum");
		System.out.println("2. Subtract");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
		System.out.print("Your Choice: ");
		userChoice = input.nextInt();
		
		switch(userChoice) {
		case 1:
			System.out.print("Enter first input: ");
			int numberOne = input.nextInt();
			System.out.print("Enter Second input: ");
			int numberTwo = input.nextInt();
			System.out.println("Sum result: " + sum(numberOne, numberTwo));
			break;
		case 2:
			System.out.print("Enter first input: ");
			int numOne = input.nextInt();
			System.out.print("Enter Second input: ");
			int numTwo = input.nextInt();
			System.out.println("Subtract result: " + substract(numOne, numTwo));
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static double substract(double a, double b) {
		return a - b;
	}
	
	

}

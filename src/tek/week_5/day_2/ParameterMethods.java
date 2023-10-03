package tek.week_5.day_2;

import java.util.Scanner;

public class ParameterMethods {
	
	public static void main(String[] args) {
//		printSumOfTwoNumbers();
//		printFirstName("Bob");
//		printFirstName("Alex");
//		System.out.println(sumOfTwoNumbers());
		System.out.println(printSum(10, 50));
	}

	// Create a method that will take user input, add them together
	// and return the result. 
	public static int sumOfTwoNumbers() {
		Scanner input = new Scanner(System.in);
		int num1, num2, result;
		System.out.println("Enter your first Number: ");
		num1 = input.nextInt();
		System.out.println("Enter your second Number: ");
		num2 = input.nextInt();
//		result = num1 + num2;
//		return result;
		return num1 + num2;
	}
	
	// Create a method that will accept two parameters of type int
	// The method should add these two numbers together and then
	// return the result.
	
	public static double printSum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void printSumOfTwoNumbers() {
		int numberOne = 10;
		int numberTwo = 20;
		System.out.println(numberOne + numberTwo);
	}
	
	public static void printFirstName(String firstName) {
		System.out.println("Your name is: " + firstName);
	}
	
	

}

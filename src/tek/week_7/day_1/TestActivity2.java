package tek.week_7.day_1;

import java.util.Scanner;

public class TestActivity2 {
	
	/*
	 * Write a java program with following steps:
	 * 	 * I. Using do while loop + Scanner, Write a program to take numbers from user.
	 * 	 * 1. The message should be "Please enter your number"
	 * 	 * II. . Store the entered value in a variable. This variable should hold the
	 * sum of each number that the user enters.
	 ** 	 * HELP: sumOfNumbers += number; 1. number in here is the name of the variable
	 * that holds the value that the user enters.
	 **
	 * * III. Stop the loop when sumOfNumbers is greater than 100.
	 * 	 * III. Run your java program.
	 * 	 * NOTE: Please select the correct name and data type for the above variables.
	 **	 * Hint: Look at the below expected output.
	 ***/
		

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double sumOfNumber = 0;
		double number;

		do {
			System.out.println("Please enter your number");
			number = userInput.nextDouble();
			sumOfNumber += number;
		} while (sumOfNumber <= 100);

		System.out.println(sumOfNumber);

		userInput.close();

	}

}

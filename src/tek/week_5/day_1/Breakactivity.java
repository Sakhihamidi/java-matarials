package tek.week_5.day_1;

import java.util.Scanner;

public class Breakactivity {
	
	public static void main(String[] args) {
		// Create a java program that will take the user input.
		Scanner input = new Scanner(System.in);
		
		// take the start of number from user
		System.out.print("Enter the start of the range: ");
		int start = input.nextInt();
		
		// take the end number from the user
		System.out.print("Enter the end of the range: ");
		int end = input.nextInt();
		
		// print the odd numbers starting from the value that user have 
		// entered as start let's say X all the way to the end let's call it Y
		
		// -> Print the odd values from X - Y, (X -> Start number)
		// 										( Y -> End number)
		
		for (int number = start; number <= end; number++) {
			// while printing the numbers, skip 2 numbers of your choice
			if (number == 3) {
				continue;
			}
			if (number == 6) {
				continue;
			}
			// while printing the numbers, break at specific condition.
			if (number == 8) {
				break;
			}
			// if non of the above conditions are true, then simply print
			// the value of the number.
			if (number % 2 != 0) {
				System.out.print(number + " ");
			}
		}
	}
	

}

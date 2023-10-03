package tek.week_3.review;

import java.util.Scanner;

public class Activity2 {

		// Ask user to enter 3 number and sum them all.
		// print the result.
		// 6 minute
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter number 1");
			double number1 = scanner.nextDouble();
			
			
			System.out.println("Enter number 2");
			double number2 = scanner.nextDouble();
			
			
			System.out.println("Enter number 3");
			double number3 = scanner.nextDouble(); 
			
			double sum = number1 + number2 + number3; 
			System.out.println("Sum of number " + sum);
			scanner.close();
			


	}

}

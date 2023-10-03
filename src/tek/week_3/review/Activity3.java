package tek.week_3.review;

import java.util.Scanner;

public class Activity3 {
		// Get 3 numbers from User
		// and find the largest one.
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 3 numbers");
			double number1 = scanner.nextDouble();
			double number2 = scanner.nextDouble();
			double number3 = scanner.nextDouble();

			double largest = 0;
			// if -> else if -> else -> chain of selection happen when if followed by
			//else if or else java will Select one and ignore other
			if (number1 > largest) {
				largest = number1;
			}
			if (number2 > largest) {
				largest = number2;
			}
			if (number3 > largest) {
				largest = number3;
			}

			if (largest == number1 && largest == number2 && largest == number3) {
				System.out.println("Numbers are equal");
			} else {
				System.out.println("Largest " + largest);
		}
}
		
		}
		
//to find largest number- int largestNumber = Math.max(num1, Matha.max(num2, num3));




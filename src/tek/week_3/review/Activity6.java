package tek.week_3.review;

import java.util.Scanner;

public class Activity6 {


	public static void main(String[] args) {
						
			// Activity 5 diffrent Approach
			// Ask User for 4 numbers
			// find average of them
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 4 different number");
			Double number1 = input.nextDouble();
			Double number2 = input.nextDouble();
			Double number3 = input.nextDouble();
			Double number4 = input.nextDouble();

			double total = number1 +number2 + number3 + number4;
			double average = total / 4;
			System.out.println("Averageis: " + average);
			input.close();
			
	
	}
}
package tek.week_3.review;

import java.util.Scanner;

public class Activity5 {
	// Activity 4 of Teacher
	// Ask User for 4 numbers
	// find average of them
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 4 different number");
		double total = 0;
		
		total += input.nextDouble();
		total += input.nextDouble();
		total += input.nextDouble();
		total += input.nextDouble();

		double average = total / 4;
		System.out.println("Average " + average);
		input.close();

	}
	
	
}

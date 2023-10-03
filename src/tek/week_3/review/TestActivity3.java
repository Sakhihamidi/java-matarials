package tek.week_3.review;

import java.util.Scanner;

public class TestActivity3 {

	public static void main(String[] args) {
		//Ask user to enter 3 number and sum them all.
		// print the result.
		// 6 minute
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		double num1 = input.nextDouble();
		System.out.println("Enter number 2 :");

		double num2 = input.nextDouble();
		System.out.println("Enter number 3 :");

		double num3 = input.nextDouble();
		input.close();
		double sumNums = num1 + num2 + num3 ;
		
		System.out.println("Sum of your 3 inputs are:" + sumNums);
	

		
		
	}

}

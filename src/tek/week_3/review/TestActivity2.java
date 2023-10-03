package tek.week_3.review;

import java.util.Scanner;

public class TestActivity2 {
	// Get 3 numbers from User
	// and find the largest one.

	public static void main(String[] args) {
		
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		double num1 = inputs.nextDouble();
		double num2 = inputs.nextDouble();
		double num3 = inputs.nextDouble();
		inputs.close();

		if(num1 == num2 && num1 == num3) {
			System.out.println("Your inputs are Equal");
		}
			else {
				if(num1 > num2 && num1 > num3) {
					System.out.println(num1);
			}
			else if (num2 > num1 && num2 > num3) {
				System.out.println(num2);
				}
			else if (num3 > num1 && num3 > num2) {
				System.out.println(num3);
				}
			}
	}
}


package tek.week_4.day_1;

import java.util.Scanner;

public class Pracctice1 {

	public static void main(String[] args) {

		Scanner inputs = new Scanner(System.in);
		double number1 = inputs.nextDouble();
		double number2 = inputs.nextDouble();
		System.out.println("Enter 2 Numbers");

	
		if (number1 < number2) {
			System.out.println("Number 2 is greater than Number 1");
		} else {
			System.out.println("Number 1 is greater than Number 2");

		}
		inputs.close();
	}
}
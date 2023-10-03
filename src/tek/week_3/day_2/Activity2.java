package tek.week_3.day_2;

import java.util.Scanner;

public class Activity2 {
	

	/*
	 * Get User input for int value
	 * check if value < 10 
	 * value > 100
	 * value == 20
	 * value >= 18
	 * value <= 200
	 * value != 1000; 
	 * 
	 * print result of each check separately. 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any natural number?");
		int value = scanner.nextInt(); 
		boolean isLessThan = value < 10; 
		boolean isGreaterThan = value > 100; 
		boolean isEqual = value == 20; 
		boolean isGreaterThanEqual = value >= 18;
		boolean isLessThanEqual = value <= 200; 
		boolean isNotEqual = value != 1000; 
		
		System.out.println(value + " less than 10 " + isLessThan);
		System.out.println(value + " greather than 100 " + isGreaterThan);
		System.out.println(value + " Equal 20 " + isEqual);
		System.out.println(value + " Greater than equal 18 " + isGreaterThanEqual);
		System.out.println(value + " less than equal 200 " + isLessThanEqual);
		System.out.println(value + " is not equal 1000 " + isNotEqual);
	}
	

}

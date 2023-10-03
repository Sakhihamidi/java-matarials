package tek.week_3.day_3;

import java.util.Scanner;

public class Activity4 {

	//Ask user to enter a natural number, 
	//if number is odd print number is odd
	//otherwise print number is even. 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a natural number");
		int number = scanner.nextInt(); 
		
		int remainder = number % 2; 
		
		if (remainder == 0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");

			
		}
		
	}

}

package tek.week_5.day_1;

import java.util.Scanner;

public class ReviewActivity2 {
	
		public static void main(String[] args) {
		// Question #2: Write a java program that will print the numbers 
		// from the 0 all the way 
		// to X even numbers only. X is the user input.
		Scanner input = new Scanner(System.in);
		int start, userInput;
		start = 0;
		
		System.out.println("Enter the end of the loop: ");
		userInput = input.nextInt();
		
		for (int i = start; start <= userInput; start++) {
			System.out.println(start);
		}
		
		
	}
	
	

}

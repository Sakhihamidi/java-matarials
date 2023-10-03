package tek.week_4.review;

import java.util.Scanner;

public class DealingWithUserInput {
	
	
	// Ask the user to enter a message.
		// Print the Uppercase and Lowercase version of the user message.
		// Print the length of the message.
		
		public static void main(String[] args) {
			String userInput =  "";
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the message: ");
			userInput = input.nextLine();
			
			System.out.println("Uppercase:" + userInput.toUpperCase());
			System.out.println("Lower Case:" + userInput.toLowerCase());
		}
		
		

}

package tek.week_3.day_2;

import java.util.Scanner;

public class Activity3 {

	// Create a random number between 0 - 2;
		// Guess the number.
		// Using scanner get a number.
		// check equality of that number with random number
		// and print the result.
		public static void main(String[] args) {
			double randomNumber = Math.random();
			int random = (int) (randomNumber * 10);
			
			Scanner input = new Scanner(System.in);
			System.out.println("Guess a number between 0 - 10");
			int guess = input.nextInt(); 
			
			boolean result = guess == random; 
			
			System.out.println("Result " + result);
			System.out.println("It was " + random);
			input.close();
		}


}

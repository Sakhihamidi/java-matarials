package tek.week_4.review;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	// Ask the user for a number to enter and check that number until you find
		// it. 
		
		// Note: that you have to ask the number from the user again and again.
		// until the user finds the number.
		
		// Bonus point: The user will total of 100 score, at each wrong iteration
		// if the user didn't managed to find the number, then score should be
		// -20.
		// Print the score as well. 
		
		public static void main(String[] args) {
			int randomNumber, userGuess;
			boolean condition = true;
			int score = 100;
			// Ask the computer to generate a random number between 1 to 10
			Random random = new Random();
			Scanner userInput = new Scanner(System.in);
			randomNumber = random.nextInt(10);
			
			while(condition) {
				System.out.println("Guess a number between 0 to 10: ");
				userGuess = userInput.nextInt();
				// the userInput < randomNumber 
				// print -> Too low, go high.
				if (userGuess < randomNumber) {
					System.err.println("Too low, go higher!");
					score -= 20;
				}
				// userInput > randomNumber
				// print -> Too high, go low.
				else if (userGuess > randomNumber) {
					System.out.println("Too high, go low!");
					score -= 10;
				}
				// if user finds the number -> print -> You got it, the number is X.
				else {
					System.out.println("You have found the number, the number is "
							+ randomNumber);
					System.out.println("Your score is: " + score);
					condition = false; 
      
      
	}
			}
		}
}

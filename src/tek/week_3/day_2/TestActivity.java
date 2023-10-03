package tek.week_3.day_2;

import java.util.Scanner;

public class TestActivity {

	public static void main(String[] args) {
		/*Arethmatic operator: + - * %
		*Relational Operator:  < > <= >=  != ==
		*Logical Operator:&& || !
		*Arrignment Operator: + += *= /=
		 * Decrement Operator: ++
		 * Increment Operators" --
		 */
		// Create a random number between 0 - 2;
				// Guess the number.
				// Using scanner get a number.
				// check equality of that number with random number
				// and print the result.
		
		double random = Math.random();
		int intRandom = (int) (random * 10);
		
		System.out.println("Guess a Number");

		Scanner userInput = new Scanner(System.in);
		int userGuess = userInput.nextInt();

		
		System.out.println("The Number Was: " + intRandom);
		
		
		
		boolean result = userGuess == intRandom; 

		System.out.println("Your Guess Was:" + result);

		userInput.close();
		
	}
	

}

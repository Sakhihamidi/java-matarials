package tek.week_5.day_1;

import java.util.Scanner;

public class UsingContinueWithLoop {
	
	
	// Continue: It will skip the execution of the specific iteration of loop
		// once the condition is met wherever you have used the continue.

			public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				System.out.print("Enter number to print the multiplication table: ");
				int userInput = input.nextInt();
				
				for (int number = 1; number <= 10; number++) {
					if (number == 2) {
						continue;
					}
					System.out.println(number + " * " + userInput + "  = " + 
							(number * userInput));
				}
				System.out.println("I am out of the loop block");
			}
			
			

}

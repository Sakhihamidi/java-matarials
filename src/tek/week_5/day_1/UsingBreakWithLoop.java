package tek.week_5.day_1;

import java.util.Scanner;

public class UsingBreakWithLoop {
	
	
	// Break: It will stop the execution of the loop
		// once the condition is met wherever you have used the break.
		
		// break is used to jump out of a loop
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number to print the multiplication table: ");
			int userInput = input.nextInt();
			
			for (int number = 1; number <= 10; number++) {
				if (number == 2) {
					break;
				}
				System.out.println(number + " * " + userInput + "  = " + 
						(number * userInput));
			}
			System.out.println("I am out of the loop block");
		}
		

}

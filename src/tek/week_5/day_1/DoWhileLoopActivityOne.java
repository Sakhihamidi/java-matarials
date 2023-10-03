package tek.week_5.day_1;

import java.util.Scanner;

public class DoWhileLoopActivityOne {
	
		
		
		// Question: Print the values staring from 1 all the way to 10
		// but at each iteration increase the value of X by 2.
		// using do while loop?
		
		// Bonus: Get the value of X from the user.
		
		// 1
		// 3
		// 5
		// .
		// .
		
		
		public static void main(String[] args) {
			
			int userNumber = 0;
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the start of the loop: ");
			userNumber = input.nextInt();
			
			do {
				System.err.print(userNumber + " ");
				userNumber += 2;
			} while (userNumber <= 10);
			
		}
		

}

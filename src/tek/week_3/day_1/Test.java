package tek.week_3.day_1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Substring below value based on the requirement 0710202350010 
		//specified below
		//Date 8 character  07102023
		//Amount 3 character  500
		//quantity 2 character  10
		
				String text = "0710202350010";
		
		String date = text.substring(0, 8);
		
		String amount = text.substring(8, 11);
		
		String quantity = text.substring(11);
		
		System.out.println(date);

		System.out.println(amount);

		System.out.println(quantity);
		
		System.out.println("_____________________");
		
		//Get user input (Scanner)
		
		// Ask for firstName,
		// Ask for LastName
		//Print out fullName.tln("-------------------------------");
		Scanner userInput = new Scanner(System.in);

			
		System.out.println("Enter your first name?");
		String firstName = userInput.next();
		
		
		
		System.out.println("Enter your last name?");
		String lastName = userInput.next(); 
		System.out.println();
		


		
		
	}

}

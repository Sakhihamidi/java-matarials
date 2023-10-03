package tek.week_3.day_1;

import java.util.Scanner;

public class Activity3 {
	
	//Get user input (Scanner)
		// Ask for firstName,
		// Ask for LastName
		//Print out fullName.
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter your first name?");
			String firstName = scanner.next();
			
			System.out.println("Enter your last name?");
			String lastName = scanner.next(); 
			
			String fullName = firstName + " " + lastName; 
			
			System.out.println("Output " + fullName.toUpperCase());		
			scanner.close(); 
		}
		
	

}

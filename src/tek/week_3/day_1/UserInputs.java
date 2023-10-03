package tek.week_3.day_1;

import java.util.Scanner;

public class UserInputs {
	
	//How to get user input. 
		public static void main(String[] args) {
			//1) get a new instance Scanner. 
			//import scanner from java.util.
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter something with space");
			String otherText = input.nextLine();
			System.out.println("Output " + otherText);
			//If we want a string from user. 
			//next() return and String without space. 
			System.out.println("Enter something without space");
			String text = input.next(); 
			System.out.println("Output " + text);
			
			//best practice is to close scanner when we are done. 
			input.close();
			
		}

}

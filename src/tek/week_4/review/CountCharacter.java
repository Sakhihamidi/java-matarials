package tek.week_4.review;

import java.util.Scanner;

public class CountCharacter {


	// Ask the user to enter a message
		// then
		// Ask the user to enter what character do we need to search in the 
		// message and to print its total count.
		
		// For Example:
		// If the message is: Hello Java!
		// If user enters e:
		
		// Your output should be: The character e repeated 1 time. 
		// if the count of the character is more than 1 
		// then it should be times not time!

		public static void main(String[] args) {
			String message = "";
			int countCharacter = 0;
			char character;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the message: ");
			message = input.nextLine();
			System.out.print("Enter the character that you want to search: ");
			character = input.nextLine().charAt(0);
			input.close();
			for (int i = 0; i < message.length(); i++) {
				if (message.charAt(i) == character )
					countCharacter++;
			}
		
			if (countCharacter == 1) {
				System.out.println("The character " + character + " repeated " 
						+ countCharacter +" time");
			} else {
				System.out.println("The character " + character + " repeated " 
						+ countCharacter +" times");
      }

  

  }

}

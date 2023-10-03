package tek.week_3.day_3;

import java.util.Scanner;

public class Activity1 {

		//Get User Input number 1 and number 2
		//Check number1 is greater that number 2
		//print result. 
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a natural number");
			int number1 =  input.nextInt(); 
			System.out.println("Enter second natural number");
			int number2 = input.nextInt(); 
			
			boolean check = number1 > number2; 
			
			System.out.println("Result " + check);
		
		
		
	}

}

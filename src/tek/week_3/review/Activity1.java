package tek.week_3.review;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		
		// Ask user to enter 3 integer number and sum them all
		
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter first natural number");
		int number1 =  input1.nextInt(); 
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter second natural number");
		int number2 =  input2.nextInt(); 
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter third natural number");
		int number3 =  input3.nextInt(); 
		
		int Total = number1 + number2 + number3;
		System.out.println("your Total is" + Total);
		
		
		
		
		
	}

}

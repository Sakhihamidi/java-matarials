package tek.week_8.day_1;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// Write a java program to reverse a String using the StringBuffer.
		// or
		// You can use the StringBuilder as well.
		StringBuffer sb = new StringBuffer("Input");
//		sb.reverse();
//		System.out.println(sb);
		System.out.println(sb.reverse());
		
		// next step.
		// get the user input and then try to reverse it. 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String to rever: ");
		String userInput = input.nextLine();
		StringBuilder strB = new StringBuilder(userInput);
//		System.err.println(strB.reverse());
		String rev = strB.reverse().toString();
//		String obj = new String(strB.reverse());
		System.out.println(strB);
		
		// Palindrome Checker
		// Write a java program to check if a value is palindrome or not.
		// is a value that even if you reverse it, it will be the same
		// dad -> dad or Input -> tupnI
		// mom -> mom 
		
		// next Task
		// check if the values are palindrome
		// if original value is equal to the reversed version
		// print -> they're palindrome
		// if they're not equal
		// print -> they're not palindrome. 
		System.err.println("Original Value: " + userInput);
		System.err.println("Reversed version: " + rev);
		if (userInput.equals(rev)) {
			System.out.println("They're palindrome.");
		} else {
			System.out.println("They're not palindrome.");
		}
		
	}
	}


package tek.week_4.day_3;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {


//		* * * * * * Exercise * * * * * *
		
// Question Number1:

// int[] numbers = {501, 596, 492, 809, 102, 1011, 1022};

// Write a java program to print the even numbers using for each loop
// Also print how many even numbers are available in this array.

// For example: We have total of X even numbers.

// You have 6 minutes to complete this challenge!


//Question No.2

//Ask the user to enter either even or odd
//if the user enters even, then you should print all of the even numbers
//plus you have to print the count of even numbers

//if the user enters odd, then you should print all of the odd numbers
//plus you have to print the count of odd numbers

//when printing the number, your output should be something like this:
//1. FirstNumber
//2. SecondNumber
//...

//-> We have total of X even numbers.
//		OR
//-> We have total of X odd numbers.

int[] numbers = {501, 596, 492, 809, 102, 1011, 1022};
int countEven = 0;
int countOdd = 0;
String userInput = "";

Scanner input = new Scanner(System.in);
System.out.print("Odd or Even: " );
userInput = input.nextLine();

switch (userInput) {
case "even":
	for (int number : numbers) {
		if (number % 2 == 0) {
			System.out.print(number + " ");
			countEven++;
		}
	}
	System.out.println();
	System.out.println("We have total of " + countEven + " even numbers");
break;
case "odd":
	for (int number : numbers) {
		if (number % 2 != 0) {
			System.out.print(number + " ");
			countOdd++;
		}
	}
	System.out.println();
	System.out.println("We have total of " + countOdd + " odd numbers");
break;
default:
	System.out.println("Invalid input");
	
	

//if (userInput.equals("even")) {
//
//} else if (userInput.equals("odd")) {
//
//} else {
//
//}

	
	
	}

}
}

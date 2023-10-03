package tek.week_7.day_1;

import java.util.Scanner;

public class TestActivity4 {
	public static void main(String[] args) {
		
//Write a java program with following steps:
//I. Use the scanner to ask the user for input, the message should be as follow:
//  1. "Please enter integer number"

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter integer number");
		int number = userInput.nextInt();
				
//II. Use while loop to print the range of numbers that the user enters all the way to 0 
//and apply the following condition for the printed numbers.
//  1. Print the numbers that are divisible by 3 OR numbers which ending with 3
		
		while(number > 0){
			if (number %3 == 0 || number % 10 == 3) {
			System.out.println(number);
		}
			number--;
			userInput.close();
		}
		}
//**HELP:
//  a. Apply the condition inside the loop as long as the number is greater than 0.
//  b. In order to find a number that end with 3, you should divide the number by 10 and the remainer should be 3.
			
//III. Decrement the number after each number is printed.

//IV. Run your program.

//**NOTE: Please select the correct name and data type for the above variable. **

//** Hint: Look at the below expected output. **

// Note: Number add as default for user input in Replit. you need write your code and click run tests.
//Expected output	
//Please enter integer number
//			18
//			15
// 			13
//			12
//			9
//			6
//			3
			
		
	}


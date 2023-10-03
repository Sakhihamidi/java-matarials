package tek.week_4.review;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main (String[] args) {
	// Write a program to ask the user for an Integer number
			// then print the multiplication table from 1 - 10
			// your output is going to be something like this:
			// if user enters 2:
			// 1 * 2 = 2
			// 2 * 2 = 4
			// 3 * 2 = 6
			// 4 * 2 = 8
			// 5 * 2 = 10
			// .
			// .
			int start = 0;
			int end = 0;
			int number = 0;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number tomake its MultiPlication Table: ");
			number = input.nextInt();
			System.out.print("Enter the start range please: ");
			start = input.nextInt();
			System.out.print("Enter the end range please: ");
			end = input.nextInt();
			
			for (int i = start; i <= end; i++) {
				System.out.println(i + " * " + number + " = " + (i * number));
			
			}

		}
	}

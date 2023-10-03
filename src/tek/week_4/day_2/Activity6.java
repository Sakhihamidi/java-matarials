package tek.week_4.day_2;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		//ask user to input start and end of a number and print even and odd numbers 
		
		int start = 0;
		int end = 0;
		
		Scanner input = new Scanner (System.in);
			System.out.println("Please add Start and End of range of numbers?");
		start = input.nextInt();
		end = input.nextInt();
		
			while ( start <= end){
				if (start % 2 == 0) {
				System.out.println("Even Numbers:" + start);
				}else {
				System.out.println("Odd Numbers :" + start);
			}
				start++;
		}
		
		
	}

}

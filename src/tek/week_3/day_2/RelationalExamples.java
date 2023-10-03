package tek.week_3.day_2;

import java.util.Scanner;

public class RelationalExamples {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//nextInt() return int values. 
		System.out.println("Enter your age?");
		int age = input.nextInt(); 
		
		boolean isEligibleToDriver = age >= 16; 
		
		System.out.println("Can you driver: " + isEligibleToDriver);
		
		input.close();
	}

	
	

}

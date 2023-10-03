package tek.week_3.day_2;

import java.util.Scanner;

public class Activity1 {
	
	
	//Get User Input
	//Favorite Country 
	
	//print the result all in upper case
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your favorite country");
		String country = scanner.nextLine(); 
		String country1 = scanner.next(); 

		
		
		String upperCaseCountry = country.toUpperCase(); 
		
		System.out.println("Output " + upperCaseCountry);
		System.out.println("Output " + country1);

	}
	

}

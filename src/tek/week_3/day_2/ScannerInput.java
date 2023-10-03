package tek.week_3.day_2;

import java.util.Scanner;

public class ScannerInput {
	
	public static void main(String[] args) {
		
		//Scanner is Built in Class in Java Library. 
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter String with space");
		String textWithSpace = inputScanner.nextLine(); 
		//How get String from Scanner. 
		System.out.println("Enter something without space?");
		String text = inputScanner.next();
		
		System.out.println("Output " + text); 
		System.out.println("Output " + textWithSpace); 
		inputScanner.close(); 
	}
	

}

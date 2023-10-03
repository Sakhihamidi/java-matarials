package tek.week_3.day_3;

import java.util.Scanner;

public class Activity2 {


		// get user input for quantity and unit price (double)
		// find the total. 
		// and check if total is greater that 200; 
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Quantity:");
			double quantity = scanner.nextDouble(); 
			
			System.out.println("Enter Price");
			double price = scanner.nextDouble(); 
			
			double total = quantity * price; 
			boolean check = total > 200; 
			System.out.println(check);
			
			
		
	
		
	}

}

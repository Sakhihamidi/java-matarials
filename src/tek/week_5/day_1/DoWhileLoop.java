package tek.week_5.day_1;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		// Do While loop will be run at least once and then it will 
		// Check the condition.
		
		// Compare to the rest of the loops while we are checking the 
		// condition first,and then executing the block of the loop.
		
		
		// * * * * ** * * * * * * * * * * * * * * * * * * * * * * * *
		
		// print the numbers from 1 to 10 using for loop
		
		for (int number = 1; number < 11; number++) {
			System.out.println(number);
		}
		
	// * * * * ** * * * * * * * * * * * * * * * * * * * * * * * *
	
		
		
		int number = 1;
			do {
			System.out.println("Inside loop block: " +number);
			number++;
			}while (number <= 10);
	}
	}
	


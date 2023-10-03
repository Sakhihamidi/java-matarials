package tek.week_5.day_3;

public class ReviewActivity {
	
	
		// Create Three instance variables
		// SELECT THE CORRECT DATA TYPE FOR THE FOLLOWING VARIABLES! 
		
		// The frist variable should store the First Name.
		static String firstName = "Alex";
		// The second variable should store the Last Name.
		static String lastName = "Curreto";
		// The Third variable should store the salary.
		static int salary = 10_000;
		
		// Create one method that will only print the first and last name.
		// Example: Alexander Curreto
		public static void printFirstLast() {
			System.out.println( firstName + " " + lastName);
		}
		
		// Create another method which will print the salary 
		// This method should require the input in order to print the message.
		// Example: Your salary is: Amount.
//		public static void printSalary() {
//			System.out.println("Your salary is: " + salary);
//		} 
		
		public static void printSalary(int passedSalary) {
			System.out.println("Your salary is: " + passedSalary);
		} 
		
		// Create the main method and call each method and print the messages!
		public static void main(String[] args) {
			printFirstLast();
			printSalary(80_000);
			
		}
	}

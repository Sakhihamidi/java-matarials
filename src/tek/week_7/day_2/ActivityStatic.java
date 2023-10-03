package tek.week_7.day_2;

public class ActivityStatic {
	
		// Create one class called "ActivityClass"
		// Create three non static variables. (You select the Data Type)
		int numberOne;
		String firstName;
		boolean flag;
		// Create three stiatc variables. (You select the Data Type)
		static int numberTwo;
		static String lastName;
		static boolean staticFlag;
		
		// Create two methods
		// First method should be static
		public static void print() {
			System.out.println("Static Method");	
		}
		// Second method should not be static or (non-static).
		public void printInfo() {
			System.out.println("Non Static Method");
		}
		
		// Create your main method
		public static void main(String[] args) {
			// Try to access both static and non-static members of the class.
			firstName = "Bob";
			System.out.println(numberOne);
			flag = true;
			
			numberTwo = 20;
			lastName = "Smith";
			staticFlag = true;
			
			print();
			printInfo();
		}
		
		// Share your code in the chat!
	}




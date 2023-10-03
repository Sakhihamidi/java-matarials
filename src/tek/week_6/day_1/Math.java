package tek.week_6.day_1;

public class Math {
	
	// Create a class and call it Math
		// Declare the members of the class (Public)
		public int num1;
		public int num2;
		
		// Create a method of your choice which will add two int or double
		// values.
		
		// 
		public Math(int newNum1, int newNum2) {
			num1 = newNum1;
			num2 = newNum2;
		}
		
		public int calculateSum() {
			return num1 + num2;
		}
		
		
		// Second method should print the result of the first method.
		
		public void printCalculation() {
			System.out.println("The result of " + num1 + " and " + num2 + " is = "	+ calculateSum() );
}
}
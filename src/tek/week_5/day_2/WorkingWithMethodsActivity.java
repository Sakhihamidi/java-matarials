package tek.week_5.day_2;

public class WorkingWithMethodsActivity {
	
	
	// Create a method that accepts only one parameter of type int
		// print the value of that int into the console.
		public static void printNumber(int number) {
			System.out.println(number);
		}
		
		// Create a method that will print the values of 1D array
		public static void printValues(int[] numbers) {
			for (int number : numbers) {
				// print the number
				System.out.print(number + " ");
			}
		}

		public static void main(String[] args) {
			int[] numbers = {1,2,3,4,5,6,7,8,9,10};
			printValues(numbers);
			
			

}
}

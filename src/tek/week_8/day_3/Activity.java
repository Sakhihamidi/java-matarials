package tek.week_8.day_3;
	
	public class Activity {
		// Create a main method
		// Create two int variables
		// Initialize the first variable to an integer value. example = 10;
		// Initiazlie the second variable to zero. example = 0;
		// print the a / b;
		
		// try{}
		// cath()
		// finally{}
		
		public static void main(String[] args) {
			
			try {
			int numOne, numTwo;
			numOne = 15;
			numTwo = 0;
			System.out.println(numOne / numTwo);
			} catch(ArithmeticException e) {
				System.out.println("Result:" + e.getMessage());
			}
			
			System.out.println("Execution continues!");
			
			try {
				
			int[] arr = {1,2,3};
			int numbers = arr[5];
			
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Second Result: " + e.getMessage());
			}
		}

		

}

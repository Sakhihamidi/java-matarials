package practice.day_2;

public class WorkingWithException {
	
	
	/*
	 * An Exception is a problem that can occur during the normal flow of an
	 * execution. 
	 * 
	 * A method can throw an exception when something fails at 
	 * runtime.
	 * 
	 * If that exception couldn’t be handled, then the execution gets 
	 * terminated before it completes the task. 
	 * 
	 * If we handled the exception, then the normal
	 * flow gets continued. Exceptions are a subclass of java.lang.Exception.
	 */
	
	// Types of expection:
	/*
	 * Unchecked Exception: These exceptions are not checked during the 
	 * compile time by the compiler. The compiler doesn’t force to handle
	 *  these exceptions. 
	 *  It includes: 
	 *  • Arithmetic Exception 
	 *  • ArrayIndexOutOfBounds Exception
	 */
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

package practice.day_2;
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;

	public class CheckedExceptions {
		// Checked Exception
		/*
		 * a checked exception is an exception that is checked at compile-time. 
		 * This means that the compiler requires that the exception either be 
		 * caught using a try-catch block or be declared to be thrown by the method 
		 * using the throws clause. 
		 * Checked exceptions typically represent situations that a well-written
		 * application should anticipate and recover from.
		 */
		
		public static void main(String[] args)  {
//			try {
//			File file = new File("name.txt");
//			FileInputStream FiS = new FileInputStream(file);
//			}catch (Exception e) {
//				System.out.println("Result: " + e.getMessage());
//			}
			try {
			File file = new File("name.txt");
			FileInputStream FIS = new FileInputStream(file);
			
			int num1 = 10;
			int num2 = 0;
			System.out.println(num1 / num2);
			
		// if you have amultiple exception if yout block of code you can simply add another catch
		// to find that exception as well.
			}catch (ArithmeticException e) {					
			System.out.println(e.getMessage());
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}

			System.out.println("Normal Flow");

			
			

		}
}

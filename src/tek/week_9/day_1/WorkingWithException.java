package tek.week_9.day_1;

	public class WorkingWithException {
		// Exceptions
		
		public static void main(String[] args) {
			try  {
			int numberOne, numberTwo;
			numberOne = 15;
			numberTwo = 0;
			numberOne = 90;
			numberTwo = 5;
			numberOne = 10;
			numberTwo = 0;
			numberOne = 20;
			numberTwo = 20 * 0;
			System.out.println(numberOne / numberTwo);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Printed after flow");
		}
	}	
	


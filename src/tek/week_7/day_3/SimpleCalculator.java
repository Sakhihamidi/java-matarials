package tek.week_7.day_3;

	public class SimpleCalculator {
//		Task:
//		    Create a class named SimpleCalculator.
//		    Add the following attributes:
//		        PI: a final double variable initialized to 3.14159.
			final double pi = 3.14159;
//		        count: a static integer to keep track of the number of calculations 
			//  made.
			static int count = 0;// no problem if initialize it or not because it is by default 0
//		    Implement the following static methods:
//		        add(double a, double b): Returns the sum of a and b.
			static double add(double a, double b) {
				count++;
				return a + b;
			}
//		  subtract(double a, double b): Returns the difference between a and b.
			static double subtract(double a, double b) {
				count++;
				return a - b;
			}
//		 multiply(double a, double b): Returns the product of a and b.
			
		static double multiply(double a, double b) {
			count++;
			return a * b;
		}
	// divide(double a, double b): Returns the division result of a by b.
		static double  divide(double a, double b) {
			count++;
			return a / b;
		}
//		Every time a method is called, increase the count by 1.
// we should add this in each method as count++;

		
//		Add a static method getCount() that returns the count value.
		public static int getCount() {
			return count;
		}
		
		public static void main(String[] args) {
			System.out.println(SimpleCalculator.add(3, 5));
			System.out.println(SimpleCalculator.subtract(7, 2));
			System.out.println(SimpleCalculator.divide(10,5));
		}
//		System.out.println(SimpleCalculator.add(3, 5)); // Expected output: 8
//		System.out.println(SimpleCalculator.subtract(7, 2)); // Expected output: 5
//		System.out.println(SimpleCalculator.divide(10,5)); // Expected output: 12.56636
//		System.out.println(SimpleCalculator.getCount()); // Expected output: 3
	}
	


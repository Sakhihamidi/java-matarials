package tek.week_8.day_1;

public class Activity3 {
	
  // Write a method that is going to add two numbers together.
		public static double sumTwoNum(double num1, double num2) {
		return num1 + num2;
		}
		
 // Write a method that is going to add three numbers together.
		public static double sumThreeNum(double num1, double num2, double num3) {
			return num1 + num2 + num3;
			}
		
 // Write a method that is going to add four numbers together.

		public static double sumFourNum(double num1, double num2, double num3, double num4) {
			return num1 + num2 + num3 + num4;
			}
		
		public static void main(String[] args) {
			System.out.println(sumTwoNum(1, 2));
			System.out.println(sumThreeNum(1, 2, 3));
			System.out.println(sumFourNum(1, 2, 3, 4));
		}
		
		
		
}

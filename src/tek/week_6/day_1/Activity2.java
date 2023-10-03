package tek.week_6.day_1;

public class Activity2 {

		public static int number;
				
		public static void main(String[] args) {
			
			//System.out.println("Result is: " + calculateSum());
			//System.out.println(number);
			
			int result = calculateSum(10, 20);
				System.out.println(result);
			}

		
		public static int calculateSum(int num1, int num2) {
			return num1 + num2;
	}
		
}

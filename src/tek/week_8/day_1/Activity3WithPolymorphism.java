package tek.week_8.day_1;

public class Activity3WithPolymorphism {
		
// Write a method that is going to add two numbers together.
		public static int sum(int a, int b) {
			return a + b;
		}
// Write a method that is going to add three numbers together.
		public static double sum(int a, double b, int c) {
			return a + b + c;
		}
// Write a method that is going to add four numbers together.
		public static double sum(long a, int b, double c, short d) {
			return a + b + c + d;
		}
// Call them in the main method as well. 
		
		public static void main(String[] args) {
			System.out.println(sum(5,10));
			System.out.println(sum(5,10.0,1));
//			System.out.println(sum(5,10,20,30));
			System.out.println(sum(10,20));
			System.out.println(Short.MAX_VALUE);
			System.out.println(Short.MIN_VALUE);
		}
	
}

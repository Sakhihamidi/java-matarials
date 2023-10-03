package tek.week_8.day_2;

/**
 * * Parameters with different data types 
 * • Parameters with different sequence of a data types 
 * • Different number of parameters
 */

public class Overloading {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static double sum(double a, int b) {
		return a + b;
	}
	
	public static double sum(double a, int b, short c) {
		return a + b + c;
	}
	
	public static double sum(double a, int b, short c, double d) {
		return a + b + c + d;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10,5));
		System.out.println(sum(10,5));	
		System.out.println(sum(10.5,20));
		System.out.println(sum(10.5,20,(short)2));
		System.out.println(sum(10.5, 20, (short)1, 20.5));
	}

	

}

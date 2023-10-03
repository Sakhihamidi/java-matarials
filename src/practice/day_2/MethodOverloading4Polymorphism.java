package practice.day_2;

public class MethodOverloading4Polymorphism {

	// Run time polymorphism --> Method Overriding
	// Compile Time polymorphism --> Method overloading
	
	// 1. Method OverLoading (Compile Time)- (Static Binding): 
	// A class having multiple methods with same name but different 
	// parameters is called Method Overloading There are three ways
	// to overload a method.

	/**
	 * * Parameters with different data types • Parameters with different sequence
	 * of a data types • Different number of parameters
	 */

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
		System.out.println(sum(10, 5));
		System.out.println(sum(10, 5));
		System.out.println(sum(10.5, 20));
		System.out.println(sum(10.5, 20, (short) 2));
		System.out.println(sum(10.5, 20, (short) 1, 20.5));
	}

}
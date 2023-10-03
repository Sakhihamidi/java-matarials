package tek.week_1.day_2;

public class TestActivity1 {

	public static void main(String[] args) {
// Declaration    = Initialization - this is just the first time, later it will be assignment
// you can assign any value to for example x later.
		int x = 5;
		int y = 10;
		int c = x+y;
		
// all above is initialization and declaration
		System.out.println(c);
	
// This is Assignment
		c = 10;
		
		System.out.println(c);
// when saying c it means to print its actual value 
// when saying "c" it mean to print the letter c as a char 
		
		System.out.println("c");
		
		
// byte    1 byte    -128 to 127
// short   2 byte    -32768 to 32767
// int     4 byte    -2147483648 to 2147483648
// long    8 byte    -9223372036854775808 to 9223372036854775807

// float   4 byte	+ or - 3.402 (6-7decimal digits)
// double  8 byte 	+ or - 1.797 (15 decimal digits)

// char    2 byte	  0 to 65536
// boolean  true/false 
		
		
		byte b1 = 127;
		byte b2 = -128;
		short s1 = 178;
		int i1 = 5780;
		long l1 = 98564;
		float f1 = 2.15f;
		double d1 = -1.5065;
		char c1 = 'a';
		boolean b3= true;
		
		boolean b4 = s1 >b1;
		System.out.println(b4);
		
	}

}

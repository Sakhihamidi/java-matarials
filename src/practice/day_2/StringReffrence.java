package practice.day_2;

public class StringReffrence {

	public static void main(String[] args) {
		
		String name = "Any Name";// String Litral
		
		String name1 = new String ("Any Name");//String Reffrence
		
		// when we are checking Equality with == it will check for Valus and Also memory location
		// when we are cheking Equality with .euals method it will only check for Values 
		
		
		String n = "Welcome";
		String n1 = "Welcome";
		System.out.println(n == n1); // it will check for 2 conditions 
		
		System.out.println(n.equals(n1)); // it will check ony one condition values are sam
		
		System.out.println("++++++++++++++++++++++");
		
		String n2 = new String ("Car");
		String n3 = new String ("Car");
		
			
		System.out.println( n2 == n3);// why False becase diffrent location False
		
		System.out.println( n2.equals(n3));// why true because bothe values are Car - True
		
		
		// when we are checking string litral with String reffrence
		
		System.out.println("++++++++++++++++++++++");

		String n4 = "Car";
		String n5 = new String ("Car");
		
		System.out.println(n4 == n5); // False 
		System.out.println(n4.equals(n5));// True	
		
		// String litral is Immutable 
		//String Reffrence is Mutable 

	}

}

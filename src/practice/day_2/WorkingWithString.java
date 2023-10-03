package practice.day_2;

public class WorkingWithString {
	
	public static void main(String[] args) {
			
	// String is sequence of characters
	// String is Class
	// String is an object 
	// Types of String 
	// 1- String litral
	// 2 - String reffrence
	// 			String builder and String Buffer - these are part of Sting Reffrence
	// Decleration = name
	//initialization = Elaha - 5 
	// String litral --- String name ="Elaha"; it will check Value and location 
	// String Immutable	
	
		
		String name ="Elaha";
		name = "ali";
		name = " John";
		name = "Negar";
		name = "Elaha";
		
		int a = 5;
		String name1 = "Any Name";
		name1 = "Habiba"; // Assignment
		
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(name == name1);
		
		name1 = "Elaha";
		System.out.println(name == name1);
		
		
		
		
}
}

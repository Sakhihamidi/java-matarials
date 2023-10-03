package tek.week_3.day_2;

public class StringEquality {
	
	public static void main (String [] args) {
	String myCity = "Mazar";
	String myCity1 = "Herat";
	
	Boolean a = myCity1 == myCity;
	
	System.out.println(a);
	
	
		String city1 = "Alexandria";
		
		String city2 = new String("Alexandria"); 
		
		//This is not recommended to check String equality. 
		//this equality check is checking String objects. 
		boolean isEqual = city1 == city2; 
		
		//equal() is recommended to check the equality of String value.
		boolean usingEqualMethod = city1.equals(city2);
		
		System.out.println(isEqual);
		System.out.println(usingEqualMethod);
		
		String nullString = null; // String is null not instantiated   
		String text = ""; //This is an empty String
		
		//checking if String is an empty String; 
		boolean isTextEmpty = text.isEmpty(); 
		System.out.println(isTextEmpty);
		
		String value = "    "; // this is a Blank String. 
		//Only in Java version 11 or Higher
		boolean isValueBlank = value.isBlank(); 
		System.out.println(isValueBlank);
		
		
		String a1 = "myLaptop";
		String b1 = "myLaptop";
		boolean isEquaA1B1 = a1 == b1;
		System.out.println(isEquaA1B1);
		
		
		String c1 = new String();
		c1 = "MyCity";
		String c2 = new String();
		c2 = "MyCity";
		boolean isEqualC1 = c1 == c2;
		System.out.println(isEqualC1);
		
		
		boolean isEqualCheck = a1.equals(b1);
		System.out.println(isEqualCheck);
		
		
		String newName = "John";
		String newName1 = new String ("John");
		Boolean newCheck = newName == newName1;
		System.out.println(newCheck);
		
	}
	}
	


package practice.day_2;

public class StaticKeyword {
	
	String name;
	static String nameA;
	
	public static void main(String[] args) {
		printInfo();
		//print(); I canot call this method because that is not static
		
		
		
		// I want to access the classs belllow
		VariableStatic VarStaObj = new VariableStatic();
	
		
		// Now if I make my variable to static or private it canot be access here 
		// it is because a static variable can be access only in its class.
		
		
	}
	
	
	
	
	
	

	
	// Static 
	
	// 1. Static Variable: A static variable belongs to the class
	// and not to any specific instance. It is shared among all instances 
	// (objects) of the class. It gets memory only once during class loading.

	// static int numberOne = 10; // static Variable
	
	
	
	
	// 2. Static Methods: A static method belongs to the class and can't 
	// access instance (non-static) members directly. Static methods can be 
	// called without creating an instance of the class.
	
	public static void printInfo() {
		System.out.println("A message");
	}
	
	public void print(){
		System.out.println("A message from static method");
	}
	
	// 3. Static Block
	
}



class VariableStatic {
	static String namestatic;
	void print() {
		System.out.println(name);
	}
	
}

package tek.week_7.day_2;

	
	public class KeywordStatic {
		
		String name;
		static String nameA;
		
		public static void main(String[] args) {
			printInfo();
			print();
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
			print();
		}
		
		public static void print(){
			System.out.println("A message from static method");
		}
		
		// 3. Static Block
		
	
		
		

}

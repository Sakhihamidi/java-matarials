package tek.week_7.day_3;

public class ForElahaMethod {
	
		
	//Built In methods: Are the methods that have been created by defualt to save time. 
	// For example: Println(), 
	
	// User Defined methods: These are the methods that is going to be 
	// defined by the user or the programmer.
	
	// Syntax: Access Modifier  returnType nameOfMethod (Parameters (optional)){} 

	// one method cannot be inside of another method.
	
		public static void printNumber(int number) {
			System.out.println(number);
			
		
		}
		
	
		
		
	
		public static double addNumbers2() {
			double a = 30;
			double b = 20;
			double sum= a+b;
			return sum;
		}
		
		
		public static int addNumbers1(int a, int b) {
			int sum = a+b;
			return sum;
		}
		
		
		
		public static void main(String [] args) {
			
			
			System.out.println(addNumbers1(5 , 8));
			
			System.out.println(addNumbers1(20 , 50));

			
			
			printNumber(10);
			
			
			System.out.println(addNumbers2());


			
			
		

}
}

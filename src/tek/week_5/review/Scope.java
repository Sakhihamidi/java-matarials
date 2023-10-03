package tek.week_5.review;

public class Scope {
	
	// Class scope: Accessibility and visibility of methods, variables, objects
		// within a class

		static int variable1 = 30;// Instance Variable

		public static void carDetails() {// scope starts here
			variable1 = 40;//GC
			int localVariable1 = 100; //local variable
			System.out.println(variable1);
			variable1 = 50; // current value 
			localVariable1 = 400;
		}// ends here
		
		//can access local variable outside method? No
		//local = 400; 
		public static void carPrice() {// scope starts here
			variable1 = 40;//GC
			int localVariable2= 300;
			
		}// ends here
		
		
		public static void main(String[] args) {

		}
		

}

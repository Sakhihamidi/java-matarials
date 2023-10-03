package tek.week_5.day_1;

public class WorkingWithScope {
	
	
	// THIS IS THE START OF THE CLASS SCOPE
		static String classScopeName = "Class Scope Value";
		
		// What is Scope? 
		// Scope: It refers to the lifecycle and accesscibility of a variable.
		
		// We are telling the compiler to access the variable from where.
		// or we can say that our variable can be accessed from where
		
		//  * -> scopre defines where the variable and be seen and can be accessed.
		//  * -> The Scope can be defined by the block of the code.
		
		// 1.Class Scope (Fields, Members of class or Instance Variable):
		// Are those variables that can be accessed within the class and the methods
		
		// 2. Method Scope (Local scope): The variables can be accessed only 
		// within the method, not outside of the method. But method scope cannot
		// be accessed outside of the method.
		
		// 3. Block Scope: You can access it wihtin the block of your code. 
		// but it cannot be accessed outside of the block.
		
		// 4. Loop Scope: The Loop scope can only be accessed inside of the loop
		// block and cannot be accessed outide of the loop.
		
		public static void main(String[] args) {  // THIS IS THE START OF THE 
				// METHOD SCOPE 
			String methodScopeVariable = "Bob"; // Method Scope variable
			System.out.println(methodScopeVariable);
			
			for (int loopScope = 1; loopScope <= 10; loopScope++) { // THIS IS THE START
				// OF THE BLOCK SCOPE 
				int blockScopeVariable = loopScope; // Block Scope Variable
				System.out.println(blockScopeVariable);
			// THIS IS THE END OF BLOCK SCOPE
				}
			System.out.println(methodScopeVariable); // method scope variable
//			System.out.println(blockScopeVariable); // Block scope variable
//			System.out.println(loopScope); // Loop scope variable
			System.out.println(classScopeName);
		// THIS IS THE END OF METHOD SCOPE
			} 
			// System.out.println(classScopeName);
	} 	// THIS IS THE CLASS SCOPE





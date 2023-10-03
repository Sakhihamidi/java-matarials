package tek.week_5.day_3;


	public class AccessModifiers {
		
		protected static String name;
		
		protected static void printName() {
			System.out.println();
		}
		
		// Access modifiers: they are keywords that will define the accessibility
		// of your Class, fields (variables), Methods (functions), interfaces,
		// or any other members. 
		
		/*
		 * // 1: Public: The public access modifier is accessible everywhere. 
		 * If a class, method, variable, etc is declared as public, it can
		 *  be accessed from any class in any package (it means from your 
		 *  entire project). 
		 *  
		 *  Public:accessible aeverywhere
		 *  Private:accessible only whitin the same class,
		 *  Protected:accessible within package and outside the package but through inheritance only
		 *  Defaul:accessible only within the same package
		 *  
		 *   
		 *    4: Default (Package-private): When no access modifier is specified, 
		 * it's set to default. The default modifier is accessible 
		 * only within package. So, if you have a class, variable, method 
		 * etc without a modifier, it can be accessed from any class
		 *  within the same package.
		 *  
		 *  
		 * // Example: 
		 * 
		 * public class MyClass {
		 * public int myVar = 10; // Accessible everywhere // 
		 *
		 * }
		 */	
		
		/*
		 * 2: Private: The private access modifier is accessible only within 
		 * the same class. So, if something is declared as private, 
		 * it can't be seen outside of its own class.
		 * 
		 * Example:
		 * 
		 * public class MyClass { // Start of the class
		 *  private int myVar = 10; // Only accessible within MyClass 
		 *  } // End of the class 
		 */
		
		/*
		 * 3: Protected: The protected access modifier is accessible within 
		 * package and outside the package but through inheritance only. 
		 * So, if something is declared as protected, it can be accessed 
		 * from within the same class, from any class within the same 
		 * package, and from subclasses in any package.
		 * 
		 * Example:
		 * 
		 * public class MyClass {
		 * 
		 *  protected int myVar = 10; // Accessible within
		 * 		MyClass, any class in the same package, and subclasses 
		 * 
		 * }
		 */
		
		/*
		 * 4: Default (Package-private): When no access modifier is specified, 
		 * it's set to default. The default modifier is accessible 
		 * only within package. So, if you have a class, variable, method 
		 * etc without a modifier, it can be accessed from any class
		 *  within the same package.
		 *  
		 * Example:
		 * 
		 * class MyClass { // MyClass has default access modifier 
		 * 
		 * int myVar = 10; // myVar also has default access modifier 
		 * 
		 * }
		 */
		

}

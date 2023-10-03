package practice.day_2;

public class StaticAndFinal {
	// Final Keyword: 
	
// 1. Variables: A final variable's value can't be modified, essentially 
// making it a constant. It must be initialized when declared or in 
// the constructor if it's an instance variable.
		
/* 1. Final Variable
 * final int numberOne = 10; System.out.println(numberOne); numberOne = 20;
 * System.out.println(numberOne);
 */

		public static void main(String[] args) {
			int numberOne = 10;
			System.out.println(numberOne);
			
			numberOne = 20;
			System.out.println(numberOne);
			
			// Now we could change it 
			
			final int numberTwo = 30;
			System.out.println(numberTwo);
			
		//	numberTwo = 15; we canot do that as it it a fanal Variable
		}
		
//2. Final Methods: A final method can't be overridden by subclasses. 
//This is used to prevent unexpected behavior from a 
//subclass altering a method.
	
//			class Parent {
//			    final void display() {
//			        System.out.println("This is a final method.");
//			    }
//			}
	//
//			class Child extends Parent {
//			    // Can't override the display method because it's final in Parent class
//			}
			
// 3. Final Classes: A final class can't be subclassed or 
// extended. This is often used for security reasons or to ensure 
// that the behavior of the class can't be changed. a final class canont have child

}

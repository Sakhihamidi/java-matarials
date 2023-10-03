package tek.week_5.review;

public class AccessMedifier {
	
	// Access Modifiers:
		// 1.Public: Accessible awnd visible to any class or package
		// 2.Private: Accessible and visible only to a certain class
		// 3.Protected: Accessible and visible to other classes and packages (Inheritance for other package)
		// 4.Default: Accessible and visible to other classes within package
	
		 //  Private:accessible only whitin the same class,
		 // Protected:accessible within package and outside the package but through inheritance only
		 // Defaul:accessible only within the same package
		 
	
		public static int publicVariable = 100; 
		private static int privateVariable = 200; 
		protected static int protectedVariable = 300; 
		static int defaultVariable = 400; 
		
		public static void addition(double start, double end) {
			System.out.println("Addition :" + start + end);
		}

		private static void modulus(double start, double end) {
			System.out.println("Modulus :" );
		}

		protected static void multiplication(double start, double end) {
			System.out.println("Multiply :" + start * end);
		}

		static void division(double start, double end) {
			System.out.println("Division :" + start / end);
		}


}

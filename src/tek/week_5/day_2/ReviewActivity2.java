package tek.week_5.day_2;

public class ReviewActivity2 {


		// Declare one Class scope varialbe and do not initialize it.
		static String classScopeName;
		
		public static void main(String[] args) {
		// Declare one Method scope varialbe and do not initialize it.
		String methodScopeName;
		// Print the values of both class and method scope variables.
		System.out.println(classScopeName);
		// we got an error that is saying your 2nd variablr is not initialized that is why you get an error 
		// because it is a local veriable it has to be initialized in order to be used
		
		System.out.println(methodScopeName);
		
		
	}

}

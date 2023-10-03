package tek.week_5.day_2;

public class ReviewActivity {
	
	// 1. Declare two class scope variables and initialize some 
	//     values to them. (You can chose your own data type)
	static String classScopeName = "Class Scope Value";
	static int classScopeNumber = 1;
	// 2. Create the main method.
	public static void main(String[] args) {
	// 3. Declare two Method scope variables and initialize some 
	//    values to them. (You can chose your own data type)
		String methodScopeName = "Method Scope Vlaue";
		int methodScopeNumber = 10;
		// 4. Print the vales that are stored both in Class scope variables
		//    and method scope variables.
		System.out.println(classScopeName);
		System.out.println(classScopeNumber);
		System.out.println("*****************************");
		System.out.println(methodScopeName);
		System.out.println(methodScopeNumber);
		
	}

}

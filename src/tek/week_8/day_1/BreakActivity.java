package tek.week_8.day_1;

public class BreakActivity {

	public static void main(String[] args) {
		// Create an empty string -> String value = "";
	    // Write a loop that will start from 1 to 10
	    // at each iteration it will concatinate a value to previous string.

		String value = "";
		for( int a = 1; a <=5; a++) {
			value +=" Hello";
			System.out.println(value);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++");

	    
	    // Create an empty string -> String value = "";
	    // Write a loop that will start from 1 to 10
	    // at each iteration it will append a value to previous string.
		StringBuilder value1 = new StringBuilder();
		for( int a = 1; a <=5; a++) {
			value1.append(" Hello");
			System.out.println(value1);
		}

	    // Which one of them is most efficient? 
		// String Buffrer is more efficient in memory saving as it is mutable
	}

}

package tek.week_7.day_3;

public class ImmutableActivity {
			
			// Create 4 different Strings
			// two variables that will have the String data type without new keyword.
			// two other variables that will have the String data type with new 
			// keyword.
			
			// Print the hashCode() for all of the four variables.
			// Concatenate something with the values of first two variables.
			
			// Print the hashCode() off all variables.
			
			
			public static void main(String[] args) {
				String str1 = "Hello";
				String str2 = "World";
				
				String str3 = new String("Java");
				String str4 = new String("Java");
				
				System.out.println(str1.hashCode());
				System.out.println(str2.hashCode());
				System.out.println(str3.hashCode());
				System.out.println(str4.hashCode());
				
				System.out.println("------------------------------");
				
				str3 = str3 + "Is Awesome!";
				str4 = str4 + "Is!";
				
				System.out.println(str3.hashCode());
				System.out.println(str4.hashCode());
			}
			

		

	}


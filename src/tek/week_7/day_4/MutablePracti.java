package tek.week_7.day_4;

public class MutablePracti {
	
	
	public class immutablePractice {
		
		
		public class ImmutablePractice {
			// Create two regular Strings and initalize some values


			public static void main(String[] args) {
				String str1 = "Bob";
				String str2 = "Bob";
				str1 = str1 + "Smith";
				// print their hashcode.
				System.out.println(str1.hashCode());
				System.out.println(str2.hashCode());
				// Create an object of String and initialize a value
				String str3 = new String("Bob");
				// print the hashCode() of the third String.
				System.out.println(str3.hashCode());
				/*
				 * compare str1 == str2 -> if yes -> print same object
				 * else -> print different object
				 */	
				if (str1 == str2) {
					System.out.println("They are sharing the same object.");
				} else {
					System.out.println("They are sharing different object.");
				}
				
				
				/* Compare the str1 or Str2 with str3 
				 * if (str1 or str2 == str3) -> print same object
				 * else -> print different object.
				 * */
				
				if (str1 == str3) {
					System.out.println("They are sharing the same object.");
				} else {
					System.out.println("They are sharing different object.");
				}
				
				if (str2 == str3) {
					System.out.println("They are sharing the same object.");
				} else {
					System.out.println("They are sharing different object.");
				}
				

}

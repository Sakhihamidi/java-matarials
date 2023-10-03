package tek.week_7.day_3;

public class WorkingWithString {

	public static void main(String[] args) {
		
// Create a String of str1 and assign a value;
// for example: String str1 = "Hello";
// Create another String of str2 and assign a value;
// for example: String str2 = "World";
				
// Compare the the value of these two variables.
// == 
//.equals();

				String str1 = "Hello";
				String str2 = "Hello";
				str1 = str1 + "World";
				String str3 = new String("Hello");
// all variables are store in Heap Memory and inside the memory heap we have String pool that store strings 
				
// if we have 100 variable with same value like Hello they all save in the same memory place 
//and the address of that value will reference to new variable ( by Add means the MEmory Space add)

				System.out.println(str1.hashCode());
				System.out.println(str2.hashCode());
				System.out.println(str3.hashCode());
				
				System.out.println(str1 == str2);// compare the address of variable --> the Address is going to be reference
				System.out.println(str1 == str3);
				System.out.println(str1.equals(str3));// compare the value of strings
				System.out.println(10 == 10);
				
// In java Strings are Immutable (Not-Changable).	
		

	}

}

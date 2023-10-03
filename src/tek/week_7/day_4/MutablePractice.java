package tek.week_7.day_4;

public class MutablePractice {
	
	
	public class MutablePractice {
		
		public static void main(String[] args) {
			// You have 6mins to solve this challange.
			
			// Create two Strings that referes to the same object.
			// Print their hashCode();
			
			String name = "Bob";
			String lastName = "Smith";
			
			System.out.println(name.hashCode());
			System.out.println(lastName.hashCode());
			
			lastName = lastName + "Bob";
			System.out.println(lastName.hashCode());
			// Create another String that creates new Object in the heap.
			// print it's hashCode().
			String middleName = new String("Smitha");
			System.out.println(middleName.hashCode());
			
			// String Litteral: The sequecnee of characters stored inside of double
			// quotation
			
			// String Pool: A special area in the heap memory where the String litteral
			// are being stored. 
			
			printName();
			
			var obj = new Practice();
			obj.printClassName();
		}
		
		public static void printName() {
			String nameFromMethod = "Bob";
			System.out.println(nameFromMethod.hashCode());
		}
		
		

}

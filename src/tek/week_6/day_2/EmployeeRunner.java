package tek.week_6.day_2;

public class EmployeeRunner {

		// Create a class call Employee
	    // This class should have fields (variables)
	    // firstName, lastName, dateOfBirth -> DataType -> String
	    
		// Create one method inside of this class that will initialize the values
	    // of the feidls to their default values (Use empty string for String
	    // Data Types).

	    // Create another method that will print the following format
	    // First Name = X
	    // Last Name = Y
	    // Date of Birth = Z

		// X, Y and Z are actually the data that you're doing to pass.
	    
	    // Create the main method in another class
	    // Create the object of Employee class and then
	    // Initialize some custom values and then call the method to
	    // print the message into the console.
		
		public static void main(String [] args) {
			Employee empObj = new Employee();
			empObj.firstName = "Alex";
			empObj.lastName = "Curretto";
			empObj.dateOfBirth = "Dec, 27";
			empObj.printInfo();
			System.out.println("+++++++++++++++++++++++++++");
			// we can have another copy of that class
			
			Employee empObj2 = new Employee();
			empObj2.firstName = "John";
			empObj2.lastName = "Keller";
			empObj2.dateOfBirth = "JAnuary, 1998";
			empObj2.printInfo();
			System.out.println("+++++++++++++++++++++++++++");

			// we can have print its null value 
			Employee empObj3 = new Employee();

			empObj3.printInfo();
			// while there is no value initialize it is possible to crash the program
			
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println(empObj3.firstName);
			// ctrl + shift + forward Slash = Multi line commenting in one time
		}

	}



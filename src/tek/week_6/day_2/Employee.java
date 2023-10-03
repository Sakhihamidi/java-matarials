package tek.week_6.day_2;

public class Employee {

	// Create a class call Employee
	// This class should have fields (variables)
	// firstName, lastName, dateOfBirth -> DataType -> String
	public String firstName;
	public String lastName;
	public String dateOfBirth;

	// Create one method inside of this class that will initialize the values
	// of the feidls to their default values (Use empty string for String
	// Data Types).
	// we should make a constructor

	public Employee(String firstName, String lastName, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.dateOfBirth = "";
	}

	// Create another method that will print the following format
	// First Name = X
	// Last Name = Y
	// Date of Birth = Z
	public void printInfo() {

		System.out.println("firstName = " + firstName);
		System.out.println("lastName = " + lastName);
		System.out.println("dateOfBirth = " + dateOfBirth);

	}
	// x, y and z are actually the data that you re going to pass
}

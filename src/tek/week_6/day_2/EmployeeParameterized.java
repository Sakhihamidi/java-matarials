package tek.week_6.day_2;

public class EmployeeParameterized {
	

	public String firstName;
	public String lastName;
	public String dateOfBirth;
	
	
	public EmployeeParameterized(String firstName, String lastName, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;

}
	public void printInfo() {

		System.out.println("firstName = " + firstName);
		System.out.println("lastName = " + lastName);
		System.out.println("dateOfBirth = " + dateOfBirth);
}
}
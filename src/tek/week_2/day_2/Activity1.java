package tek.week_2.day_2;

public class Activity1 {

	// Write main method
	// String title,
	// String firstName,
	// String lastName
	// FullName Example(Mr. Shokriyan, Mohammad)
	// print the length of fullName
	// Print full name all in Uppercase.
	public static void main(String[] args) {
		String title = "Mr.";
		String firstName = "Elon";
		String lastName = "Mask";

		String fullName = title + " " + lastName + ", " + firstName;

		String fullNameUp = fullName.toUpperCase();

		System.out.println(fullNameUp);

		int fullNameLength = fullName.length();

		System.out.println(fullNameLength);

	}

}

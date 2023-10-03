package tek.week_2.day_2;

public class Activity5 {

	public static void main(String[] args) {
		String fullName = "John Smith";
		// Subtring to FirstName and Lastname.
		int spaceIndex = fullName.indexOf(' ');
		String firstName = fullName.substring(0, spaceIndex);
		String lastName = fullName.substring(spaceIndex);

		System.out.println(firstName);
		System.out.println(lastName.trim());

	}
}
package tek.week_2.day_2;

public class StringManipulation {

	public static void main(String[] args) {

		String city = "Alexandria";

		// Get let length of String;
		int cityLength = city.length();
		System.out.println(cityLength);

		String password = "simplePassword@1231";
		int passLength = password.length();
		System.out.println(passLength);
		System.out.println("----------------------------------------");

		// String Concat ( Append 2 or more string to Each other).
		String firstName = "Mohamamd";
		String lastName = "Shokriyan";
		// FullName first name + last name;
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);

		System.out.println("----------------------------------------");

		// String fullName2 = firstName.concat(" ").concat(lastName);
		String fullName2 = firstName.concat(lastName);
		System.out.println(fullName2);

		System.out.println("----------------------------------------");

		String firstName1 = "Ahmad";
		String middleName1 ="Haji";
		String lastName1 ="Mohammadi";
		
		String FullNameNew = firstName1.concat(middleName1).concat(lastName1);
		System.out.println(FullNameNew);
		
		String FullNameSpace = firstName1.concat(" ").concat(middleName1).concat(" ").concat(lastName1);
		System.out.println(FullNameSpace);

		// Uppercase and lowercase
		String gender = "mALe";

		String genderUpperCased = gender.toUpperCase();
		System.out.println(genderUpperCased);

		String genderLowerCased = gender.toLowerCase();
		System.out.println(genderLowerCased);

	}
}
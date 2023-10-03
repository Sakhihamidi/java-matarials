package tek.week_2.day_3;

public class Activity5 {
	public static void main(String[] args) {

		String email = "shokriyan@gmail.com";
		// make sure it's a valid email that contains @
		// substring the email provider.
		int atSignIndex = email.indexOf('@');
		System.out.println("Index of @ sign " + atSignIndex);

		String provider = email.substring(atSignIndex);
		System.out.println(provider);
	}

}

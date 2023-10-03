package tek.week_3.day_3;

public class SwitchStatement {


	public static void main(String[] args) {
		// m -> male and f -> female
		char gender = 'M';

		switch (gender) {
		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
		default:
			System.out.println("Wrong entry");
			break;
		}

	}

}

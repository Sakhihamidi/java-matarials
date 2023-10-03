package tek.week_3.day_3;

import java.time.LocalDate;

public class Activity5 {
	
	
	// declare variable dayOfWeek and assign value 1 2 3 4 5 6 7
		// 1 = Sunday
		// 2 = Monday
		// 3 = Tuesday
		// 4 = Wednesday
		// 5 = Thursday
		// 6 = Friday (Funday)
		// 7 = Saturday
		public static void main(String[] args) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter Day of Week number");
//			int dayOfWeek = scanner.nextInt();
			//Out of Topic
			LocalDate todaysDate = LocalDate.now();
			System.out.println(todaysDate);
			int dayOfWeek =  todaysDate.getDayOfWeek().getValue();
			switch (dayOfWeek) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Wrong Entry");
				break;
			}
		
		
	}

}

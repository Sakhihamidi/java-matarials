package tek.week_7.day_1;

public class TestActivity1 {

	public static void main(String[] args) {

		for (int number = 20; number >= 0; number--) {
			if (number % 2 == 0) {
				System.out.print(number);
				if (number != 0) {
					System.out.print(", ");
				}

			}

		}
		System.out.print((", "));

	}

}

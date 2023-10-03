package tek.week_4.day_3;

public class TwoDArray {

	public static void main(String[] args) {
		// int[][] numbers = { {10,20,30,40}, {50,60,70} };
		// print the values of the 2D array using the nested loop

		int[][] numbers = { { 10, 20, 30 }, { 40, 50, 70, 80, 90} };

		for (int row = 0; row < numbers.length; row++) {
			for(int col =0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("*******************************************");

		// Print the values of the below array into the console.
		String[][] names = { { "Bob" }, { "Erin", "Eric" }, { "Trevor", } };

		// Customize the message: "The value stored at row 0 and col 0 is: Bob"

		for (int row = 0; row < names.length; row++) {
			for (int col = 0; col < names[row].length; col++) {
				System.out.print("[" + row + "][" + col + "]: " + names[row][col] + " ");
				System.out.println();

			}

		}
		
	}
}
package tek.week_4.day_3;

public class Activity1 {
	public static void main(String[] args) {

		// write a program to print the combination of numbers between 10 to 15

		for (int outer = 10; outer <= 15; outer++) {
			for (int inner = 10; inner <= 15; inner++) {
				//System.out.print(outer+ "" + inner + ", ");
				System.out.print("" + outer + inner + ", ");

				// these two prints are same
				// when you add "" in the first part of print it means no to add the values
				// together
				// but it means to place them beside each other

			}
			System.out.println();
		}

	}

}

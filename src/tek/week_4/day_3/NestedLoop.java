package tek.week_4.day_3;

public class NestedLoop {

	public static void main(String[] args) {
		// Write a java program to print the combination of numbers
		// between 10 to 15;

//		// outer loop
		for (int outer = 10; outer <= 15; outer++) {
//			// ineer loop
			for (int inner = 10; inner <= 15; inner++) {

				System.out.print("" + outer + " " + inner + ", ");
			}
			System.out.println();
		}

	}
}

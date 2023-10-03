package tek.week_4.review;

public class ArrayReversal {

	public static void main(String[] args) {

		// String[] names = {"Bob", "Eric", "Trevor", "Tony"};
		// Print the values of this array in reverse order.

		// Tony
		// Trevor
		// Eric
		// Bob

		String[] names = { "Bob", "Eric", "Trevor", "Tony" };
		for (int index = names.length - 1; index >= 0; index--) {
			System.out.println(names[index]);
		}
		System.out.println("*****************************");

		for (String name : names) {
			System.out.println(name);
		}

	}

}

package tek.week_2.day_2;


public class Activity4 {

	public static void main(String[] args) {
		String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing "
				+ "elit, sed do eiusmod tempor incididunt ut";
		// extract first 20 character of the text.
		String first = loremIpsum.substring(0, 20);
		System.out.println(first.length());
		System.out.println(first);
		// extract last 30 character of the text.
		int length = loremIpsum.length();
		String last = loremIpsum.substring(length - 30);
		System.out.println(last.length());
		System.out.println(last);
		

	}

}

package tek.week_2.day_2;

public class Activity2 {

	public static void main(String[] args) {
		String text = "Today is wednesday";
		//Find first, middle and last character of above text; 
		int length = text.length(); 
		int firstIndex = 0; 
		int lastIndex = length - 1; 
		int middleIndex = lastIndex / 2; 

		char firstChar = text.charAt(firstIndex);
		char lastChar = text.charAt(lastIndex);
		char middleChar = text.charAt(middleIndex);

		System.out.println(firstChar);
		System.out.println(middleChar);
		System.out.println(lastChar);
	}
}

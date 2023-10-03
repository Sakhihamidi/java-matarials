package tek.week_2.day_2;

public class StringManipulation2 {
	
	public static void main(String[] args) {

		//Using Index
		String text = "Hello World";

		int length = text.length(); 
		System.out.println(length);

		//returning character of an index
		char character = text.charAt(6);
		System.out.println(character);

		char lastCharacter = text.charAt(10);
		System.out.println(lastCharacter);

		char firstCharacter = text.charAt(0);
		System.out.println(firstCharacter);

		//IndexOf looking for index of an specific character. 
		//indexOf will return first index that find in the String
		String value = "Today was rainy";
		int indexOfA = value.indexOf('a');
		System.out.println(indexOfA);

		int indexOfY = value.indexOf('y');
		System.out.println(indexOfY);

		//If character is not exist will return -1 
		int indexOfX = value.indexOf('x');
		System.out.println(indexOfX);

		int lastIndexOfA =value.lastIndexOf('a');
		System.out.println(lastIndexOfA);

		//Substring is a method used to extract part of the String
		String fullName = "John Smith";
		//John -> firstName, 
		//Smith -> last Name; 
		//beginIndex and endIndex. 
		String firstName = fullName.substring(0 , 4);
		System.out.println(firstName);

		//beginIndex 
		String lastName = fullName.substring(5);
		System.out.println(lastName);
	}
	
}

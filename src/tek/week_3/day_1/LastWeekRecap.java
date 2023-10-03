package tek.week_3.day_1;

public class LastWeekRecap {

	public static void main(String[] args) {
		
String text = "Today is hot I did not go out with";
		
		String subtringed = text.substring(7);
		String cutFromMiddle = text.substring(0 , 3);
		//System.out.println(subtringed);
	//	System.out.println(cutFromMiddle);
		

		
		int secondIndex = text.indexOf('i', 17);
		System.out.println(secondIndex);
		
		String textUppercased = text.toUpperCase(); 
		//System.out.println(textUppercased);
		
		int textLenght = text.length(); 
		
		char character = text.charAt(3);
		//System.out.println(character);
		
		int index = text.indexOf('o');
		//System.out.println(index);
		
		int lastIndex = text.lastIndexOf('o');
		//System.out.println(lastIndex);
		
		

	}

}

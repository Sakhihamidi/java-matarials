package tek.week_9.day_2;

import java.util.ArrayList;

public class ReviewActivit {
			
		public static void main(String[] args) {
			
			// Create an ArrayList of String -> colors.
			ArrayList<String> colors = new ArrayList<>();
			// Add some values to the arrayList

			colors.add("Red");
			colors.add("Blue");
			colors.add("Yellow");
			colors.add("Green");
			colors.add("Black");
			
			// Print the values of the arrayList using it's object name.
			System.out.println(colors);
			
			// remove a value from the arrayList using it's name.
			colors.remove("Black");
			
			// remove an index from the arrayList using it's index number.
			colors.remove(1);

			// print it's values using the enhanced loop.
			for (String color : colors) {
				System.out.println(color);
			}
			
			System.out.println(colors);
		}

}

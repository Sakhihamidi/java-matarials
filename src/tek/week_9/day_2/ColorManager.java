package tek.week_9.day_2;

import java.util.ArrayList;


public class ColorManager { //create a class called ColorManager

		ArrayList<String> colors; // create an Arralist
// creat constractor of class  for best practices it is better to initialize oer array inside od constractor
		public ColorManager() {
			colors = new ArrayList<>();
		}
// create a method called addColor() that is going to take one String parameter and add it to to the ArrayList
		void addColor(String color) {
			colors.add(color);
		}
// create a method called removeColor() that is going to take one String parameter and add it to to the ArrayList
		
		void removeColor(String color) {
			colors.remove(color);
		}
// creat a method called printColor() that is going to print the values of the ArrayList	
		void printColors() {
			System.out.println("ArrayList values: ");
			System.out.println(colors);

			for (String color : colors) {
				System.out.println(color);
			}
			//}
//			System.out.println(colors.get(0));
		}

		
	
	

}

package tek.week_4.day_2;

import java.util.Random;

public class ForEachLoop {

	public static void main(String[] args) {
			String [] countries = {"United States", "Spain", "London", "Indian"};
			int index = 0;
				
			//for each loop
			
			for (String names1 : countries) {
				
				System.out.println(index +" "+ names1);
				index++;

			}
			
			
	}

}

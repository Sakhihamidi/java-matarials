package tek.week_5.day_1;

public class ReviewActivity3 {
	
	
		public static void main(String[] args) {
			// Create 2D array of String add some values to it 
			// and then try to print it using one of the loops. 
			
			String[][] names = { {"Bob", "Erin"}, {"Trevor", "Lydia", "Alex"} };
			
			for (int row = 0; row < names.length; row++) {
				for (int col = 0; col < names[row].length; col++) {
					//if (names[row][col].equals("Alex")) {
						System.out.println(names[row][col]);
					} 
				}
				System.out.println();
			}
			
		}
		



package tek.week_9.day_1;

	
	public class Activity {
		
		// Activity: 
		
		// Create an array of size 5
		// add more than 5 elements to the array.
		// loop through the array and print it's values.
		
		public static void main(String[] args) {
			try {
				int[] numbers = new int[5];
				numbers[0] = 10;
				numbers[1] = 10;
				numbers[2] = 30;
				numbers[3] = 40;
				numbers[4] = 50;
				numbers[5] = 50;

				for (int n : numbers) {
					System.out.println(n);
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Out of try catch block");

		
			}
			
		}

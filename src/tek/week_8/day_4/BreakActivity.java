package tek.week_8.day_4;
	
	public class BreakActivity {
		// Create an empty string -> String value = "";
		// Write a loop that will start from 1 to 10
		// at each iteration it will concatinate a value to previous string.
		
		// Create an empty string -> String value = "";
		// Write a loop that will start from 1 to 10
		// at each iteration it will append a value to previous string.
		
		// Which one of them is most efficient? 
		
		public static void main(String[] args) {
			String value = "";
			for (int i = 1; i <= 5; i++) {
				value += " Hello";
//				value = value + "Hello";
				System.out.println(value);
			}
			
			System.out.println("********************************");
			
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= 5; i++) {
				sb.append(" Hello");
				System.out.println(sb);
			}
		}
		

}

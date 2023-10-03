package tek.week_7.day_4;

	
	public class StringBufferPractice {
		public static void main(String[] args) {
			
			// Create StringBuffer and store value of "Java"
			StringBuffer sb = new StringBuffer("Java");
			// Print it's hashCode();
			System.out.println(sb.hashCode());
			// append() "Is Awesome" with the previous value. -> "Java"
			sb.append(" Is Awesome");
			// Print the value of your StringBuffer "Java Is Awesome"
			System.out.println(sb);
			// Reverse() "Java Is Awesome".
			System.out.println(sb.reverse());
			// Print the reversed version.
			System.out.println(sb.reverse());
			System.out.println(sb);
		}
		
		
		

}

package tek.week_3.day_2;

public class LogicalOperators {
	
	// Logical Operators 
		// && -> AND (it's return true if all the conditions is true)
		// || -> OR (it return true if one of the condition is true). 
		// ! -> NOT (opposite of the condition)
		public static void main(String[] args) {
			//&& -> AND
			
			int age = 65; 
			boolean isEligibleForArmy = age >= 18 && age <= 35; 
			
			//System.out.println(isEligibleForArmy);
			
			// || -> OR 
			double number = 21;
			boolean result = number == 10 || number >= 20; 
			System.out.println(result);
		}
		

}

package tek.week_3.day_3;

public class RecapTuesday {

	
	public static void main ( String [] args) {
	/*
	 * Relational operators. 
	 * result of all compares will be a boolean false | true 
	 * 
	 * > greater than, 
	 * < less Than
	 *	>= greater than equal
	 *	<= less than equal
	 *	== equality 
	 *	!= not equal
	 */
	//Logical Opeartor 
	/* when having 2 or more conditions to compare. 
	 * && -> AND all the condition should be true to return true. 
	 * false && true -> false
	 * true && true -> true
	 * false && false -> false
	 * 
	 * || -> OR one of the conditions should be true to return true
	 * true || true -> true
	 * false || true -> true 
	 * false || false -> false
	 * true || false -> true
	 * false || true || false -> true
	 * 
	 * ! -> NOT the opposite of the condition.
	 * != not equal 
	 * 
	 * !String.isEmpty(); -> String is not Empty
	 * 
	 * !String.equals(); -> String is not equal
	 */
	//String literal
	String name = "John";
	//String reference
	String name1 = new String("John");
	
	//String equality
	//checking the object reference of String 
	//Not the value Of String
	boolean check = name == name1;
	System.out.println(check);
	
	String name2 = name1; 
	boolean check2 = name1 == name2; 
	//System.out.println(check2);
	
	//Check String value equality
	//method equals(); 
	//Recommended to check String value equality. 
	boolean check3 = name1.equals(name2);
	System.out.println(check3);
	
	String gender = "Male";		
	boolean genderCheck = gender.equals("male");
	System.out.println("Gender check " + genderCheck);
	
	//ignore String case sensitivity .
	boolean ignoreCase = gender.equalsIgnoreCase("male");
	System.out.println("Gender check Ignore case " + ignoreCase);
}
		
		
		
	}

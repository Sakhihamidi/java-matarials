package tek.week_1.day_3;

public class testActivity1 {

	public static void main(String[] args) {
			
	/* Assignment operator = 
	 * Equality operator  == 
	 * Not Equality operator !=
	 * 
	 * 	
	*/
		int x = 10;
		int y = 5;
		boolean z = x == y;
		System.out.println(z);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		System.out.println("checking relational Operators:  " + (x > y));
		
		int a =5;
		int b = 5;
		int c = 5;
		
		if (a == b && c == b) {
			System.out.println( "I love JAVA");
		}
		
		else {
		System.out.println("I dont love JAVA");
		}
	
		
		/* AND both must be true-- and sign in java is &&
		 * OR one must be true -- or sign in java is ||
		 * NOT get the input and reverse it - NOt sign in java is !
		 */
	}
}

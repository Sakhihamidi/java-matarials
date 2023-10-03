package tek.week_8.day_2;	
	
	public class ReviewActivity {
		
		// * * * * * * * * * Practicing Mutable Strings * * * * * * * * *
		
		// Using StringBuilder or StringBuffer, practice 4 most useful methods.
		// .append().
		// .delete().
		// .toString().
		// .equals().
		
		// Write your code and paste it in the chat.
		// Good Luck!
		
		public static void main(String[] args) {
			StringBuffer sb = new StringBuffer("Hello");
			System.out.println("Before Append: " + sb);
			sb.append(" Wolrd.");
			System.out.println("After append: " + sb);
			sb.delete(5, 8);
			System.out.println("After Delete: " +sb);
			String immutable = sb.toString();
			System.err.println(immutable.hashCode());
			System.out.println(sb.hashCode());
			System.err.println("After toString: " + immutable);
//			boolean check = ;
			System.out.println(sb.equals(immutable));
			
			String str = "Hello";
			String str2 = "Hello";
			System.out.println(str.equals(str2));
		}
	}
	
	
}

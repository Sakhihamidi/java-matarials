package practice.day_2;

public class StringBufferAndBuilder {
	
	public static void main(String[] args) {
		
	
//String Buffer and String Builder are Mutable
//Returns True only when a stringbuffer object(value)is compared with it self other wise it will return false
		
	
	StringBuffer name = new StringBuffer("Elaha");
	StringBuffer name1 = new StringBuffer("Elaha");
	
	System.out.println(name.hashCode());
	System.out.println(name1.hashCode());
	
	System.out.println(name == name1);// False
	
	System.out.println(name.equals(name1));//Fals
	
	System.out.println(name.append(" Sharif"));
	System.out.println(name.hashCode());
	System.out.println(name.reverse());
	
	System.out.println(name.insert(4, " Name"));
	
	
	System.out.println(name.delete(0, 6));
	
	System.out.println(name.length()); // int
	System.out.println(name.hashCode());
		
	
}
}
package tek.week_1.day_2;

public class Activity3{
public static void main(String [] args ){
	System.out.println("you have succefully Created your account");
	System.out.println("Second: Australia");
	System.out.println("Third: Egypt ");
	System.out.println("Fourth: Afghanistan");
	
		
	// Variables. are the properties that hold values of a specific type.
		/*
		 * Data type define the type of value for each variable. 1) primitive data
		 * types. (defined and reserve types for variable). natural numbers. (negative
		 * and positive. 10 , 20 , 21, - byte -> 1 byte of memory (-127 to 127) - short
		 * -> 2 byte (-32300 to 32000) - int -> 4 byte - long -> 8 byte 
		 * 
		 * floating numbers
		 * (negative and positive ) 10.23 , 43.21 - float -> 4 byte - 
		 * double -> 8 byte -
		 * up to 16 decimal point Only true / false - boolean -> 1 bite of memory a
		 * single character 'a' 'A' - char - 2 byte
		 * 
		 * More info in this link ->
		 * https://mytekschool.sharepoint.com/sites/SDETWiki/SitePages/Java-Data-Types.aspx
		 * 
		 * 2) non-primitive data type.
		 */
			byte smallNumber = 32;
			short age = 36;

			int distanceToCali = 3200;

			// by default java will assume all numbers are int
			// unless you define with letter 'L'
			long maxAmount = 3_139_999_999L;
			// by default all floating/decimal number deal as double
			// unless you define it with letter 'F'
			float applePrice = 0.99F;
			double price = 19.23;

			//Boolean only accept true | false
			boolean isJavaBoring = false;

			boolean isJavaHard = false;

			boolean isJavaFun = true;

			char letterA = 'a';
			char gender = 'F';

			char grade = 'A';
			char specialChar = '^';
			/*
			 * MultiLine commenting. 
			 * How Java Works. 
			 * 1) We have to write code using JDK
			 * JDK -> Java Development KIT
			 * JDK Contains Java Libraries (Classes and Objects)
			 * that helps write program in JAVA. 
			 * 
			 * JRE -> JAVA Runtime Environment 
			 * Container everything required to execute java application. 
			 * 
			 * JVM -> Java Virtual Machine 
			 * JVM execute java code, and translate to computer language
			 * 
			 * Compiler -> Java Compiler will compile java files to class files. 
			 * only class file is executable. 
			 * 
			 * java -> compile to class -> send to JVM -> JVM Translate 
			 * and send to processor. 
			 * 
			 * Java Execution Process. 
			 * 1) Always start from main method. 
			 * 2) Top to bottom -> left to right. line by line. 
			 */
}
}
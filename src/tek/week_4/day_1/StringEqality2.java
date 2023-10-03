package tek.week_4.day_1;

public class StringEqality2 {

	public static void main(String[] args) {
		
		String firstName= "tekSchool";
		String secondName= "TekSchool";
		
		firstName.toLowerCase();
		secondName.toLowerCase();
		
		String str1 = firstName.toLowerCase();
		String str2 = secondName.toLowerCase();
		
		System.out.println(str1);
		System.out.println(str2);
				
		boolean check = str1.equals(str2);
		
		System.out.println(firstName.equals(secondName));
		
		System.out.println(check);

	}

}

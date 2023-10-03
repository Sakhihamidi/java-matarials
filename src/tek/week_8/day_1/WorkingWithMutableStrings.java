package tek.week_8.day_1;

public class WorkingWithMutableStrings {

	public static void main(String[] args) {
		
		StringBuilder strB = new StringBuilder("Builder");
		strB.append(" Java");
		StringBuffer strBf = new StringBuffer("Buffer");
		strBf.append(" Java");
		
		System.out.println(strB);
		System.out.println(strBf);
		
		// delete
		// starting index - end index
		System.out.println(strB.delete(0,5));

	}

}

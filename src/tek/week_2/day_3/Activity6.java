package tek.week_2.day_3;

public class Activity6 {
	public static void main(String[] args) {
		String pagination = "  1100 – 1110 of 88322 ";
		//substring 8322
		//Approach 1
		int indexF = pagination.indexOf('f');	
		String totalCount = pagination.substring(indexF + 2);
		System.out.println(totalCount);
		
		
		System.out.println("--------------------------------------------");
		//approach 2
		String trimmedPagination = pagination.trim();
		
		int indexSpace = trimmedPagination.lastIndexOf(' ');
		
		String recordCount = trimmedPagination.substring(indexSpace);
		System.out.println(recordCount.trim());
		System.out.println("--------------------------------------------");

		
		int indexF1 = pagination.indexOf('f');
		String totalCount1 = pagination.substring(indexF1+2);
		System.out.println(totalCount1);
		
		System.out.println("--------------------------------------------");

				
		int indexSpace1 = pagination.lastIndexOf(' ');
		String totalCount2 = pagination.substring(indexSpace1-5);
		System.out.println(totalCount2);
		

		
	}
	

}

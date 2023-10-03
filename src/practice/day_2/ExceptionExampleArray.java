package practice.day_2;

public class ExceptionExampleArray {


		public static void main(String[] args) {
			
			try {
				int [] a = {1,2,3};
				
				System.out.println(a[3]);
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

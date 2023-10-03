package tek.week_3.day_1;

import java.util.Date;

public class Terminologies {
	
	//Declaration and assignment (equal to a value)
		//Class level variable. OR Instance Variable
		int age = 10;
		//Declaration but not assignment
		String city; 
		
		public static void main(String[] args) {
			//Local variable belongs to main method. 
			String name = "Something";
			
			if (10 == 10 ) {
				//declaring variable in a block it's only accessible 
				//inside that block {}
				long number = 1000000L; 
			}
			System.out.println(name);
			
			//Instantiation: new object (Copy) 
			//OR new Instance of Class or Object
			Date dateVariable = new Date(); 
			String country =  new String(); 
		}
		
		
		

}

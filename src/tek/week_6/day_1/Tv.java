package tek.week_6.day_1;

public class Tv{
	
	
	// Create a class Called Tv
		// Create one field (Variable) called tvName; 
		public String tvName;
		// Create the default (non-parametrize) constructor first.
		public Tv() {
//			tvName = null;
			tvName = ""; // Best Pracitce
		}
		// Create the parametrized constructor for the same class.
		// And pass the value in the main method while creating object of 
		// the classs.
		
		public Tv(String tvName) {
			this.tvName = tvName; // Best Pracitce
		}
		
		// Create a method that will print the value of the tvName.
		public void printTvName() {
			System.out.println(tvName);
			
			
			}
		}
		



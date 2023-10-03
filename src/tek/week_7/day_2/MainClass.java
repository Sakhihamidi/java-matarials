package tek.week_7.day_2;

	public class MainClass {
		/*
		 * 5. Main Class - SmartphoneTest: 
		 * Create instances of FlagshipPhone, BudgetPhone, and GamingPhone. 
		 * Call their methods to 
		 * demonstrate hierarchical inheritance.
		 */
		
		public static void main(String[] args) {
			var flagObj = new FlagshipPhone1("Apple", "IOS", "2500MPH", "Excellent");
			var budgObj = new BudgetPhone("Pixel", "Android", "1500MPH", "1500");
			var gamObj = new GamingPhone("Asus", "Android", "6500MPH", "2.5GH");
			
			flagObj.sendMessage();
			budgObj.sendMessage();
			gamObj.sendMessage();
		}
		

}

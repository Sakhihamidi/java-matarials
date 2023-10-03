package tek.week_8.day_2;
	
	public class ActivityRunner {
		
		public static void main(String[] args) {
			
			var bikeObj = new Bike(4, "BMW", "Yamaha", 456);
			bikeObj.printMake();
			bikeObj.printMake();
			
			var vObj = new Vehicle(4,"Toyota");
			vObj.printMake();
		}
		
		

}

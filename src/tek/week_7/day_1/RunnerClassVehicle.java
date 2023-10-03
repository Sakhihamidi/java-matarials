package tek.week_7.day_1;

	
	public class RunnerClassVehicle {

		public static void main(String[] args) {
			
			var carObj = new Car("Toyota", "4Runner", 2020, 4);
			carObj.displayInfo();
			carObj.honk();
			
			System.out.println("------------------------------------------");
			
			var motorobj = new MotorCycle("Harley", "Davidson", 2022, 2);
			motorobj.displayInfo();
			motorobj.rev();
		}
		
		
		
	
	

}
